package com.thoughtworks.tw101.exercises.exercise9;

import com.sun.tools.corba.se.idl.InvalidArgument;

import java.util.List;
import java.util.ArrayList ;

public class Node {

    /**
     * Used for representing the results of lexicographical comparisons
     */
    private static enum LexOrder {
        before,
        same,
        after
    }


    private String name;
    private Node left ;
    private Node right ;

    /**
     * @param other The Node to compare against
     * @return The result of a lexicographical comparison of the names of
     *          this and other
     *
     * For example, if this.name comes before other.name in a dictionary,
     * LexOrder.before will be returned
     */
    private LexOrder compare(Node other) {
        int result = this.name.compareTo(other.name) ;

        if (result < 0) {
            return LexOrder.before ;
        }
        else if (result == 0) {
            return LexOrder.same ;
        }
        else { //if (result > 0)
            return LexOrder.after ;
        }
    }

    public Node(String name) {
        this.name = name;
        left = null ;
        right = null ;
    }

    public void add(String nameOfNewNode) {

        Node newNode = new Node(nameOfNewNode) ;
        LexOrder order = compare(newNode) ;
        add(newNode, order) ;
    }

    public void add(Node node, LexOrder order) {
        if ((order == LexOrder.same) || (order == LexOrder.after)) { //i.e. we're the same as or after the node to be added
            if (this.left == null) {
                this.left = node ;
                return ;
            }
            else {
                left.add(node, left.compare(node)) ;
            }
        }
        else { // (order == LexOrder.before) //i.e. in a dictionary, we'd be before the node to be added
            if (this.right == null) {
                this.right = node ;
                return ;
            }
            else {
                right.add(node, right.compare(node)) ;
            }
        }
    }

    public List<String> names() {

        List<String> names = new ArrayList<String>() ;

        return names(names) ;
    }

    private List<String> names(List<String> names) {

        if ((left == null) && (right == null)) {
            names.add(name) ;
            return names ;
        }

        if (left != null) {
            left.names(names) ;
        }

        names.add(name) ;

        if (right != null) {
            right.names(names) ;
        }

        return names ; //pretty sure this will never be reached, but won't compile without it
    }


}
