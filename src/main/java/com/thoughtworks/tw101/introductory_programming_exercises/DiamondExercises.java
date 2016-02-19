package com.thoughtworks.tw101.introductory_programming_exercises;

import java.lang.StringBuilder ;
import java.util.Arrays;
import java.util.LinkedList;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        drawAnIsoscelesTriangle(n, false, 0);
    }

    /**
     * Overload helper method for drawAnIsoscelesTriangle(int)
     *
     * @param n The height of the triangle
     * @param flipped Whether to flip the triangle upside-down
     * @param offsetRight The number of spaces to offset the triangle to the right, if any
     */
    private static void drawAnIsoscelesTriangle(int n, boolean flipped, int offsetRight)  {
        /* the length of all rows is determined by the length of the final row, which is equal
           to 2x the total number of rows minus 1 */
        int sizeOfRows = (2 * n) - 1 ;
        int currentRowStartingPosition = sizeOfRows / 2 ;

        StringBuilder outputLine = new StringBuilder() ;
        LinkedList<String> output = new LinkedList<String>() ;

        for (int i = 0, currentRowAsterisksCount = 1 ; i < n ; i++) {

            for (int j = 0; j < (currentRowStartingPosition + offsetRight) ; j++) {
                outputLine.append(' ') ;
            }

            for (int j = 0; j < currentRowAsterisksCount; j++) {
                outputLine.append('*') ;
            }


            outputLine.append('\n') ;
            output.addLast(outputLine.toString()) ;
            outputLine = new StringBuilder() ; //reset


            currentRowStartingPosition -= 1 ;
            currentRowAsterisksCount += 2 ;
        }

        printStringList(output, flipped);
    }

    //Helper method for drawAnIsoscelesTriangle(int, boolean). Allows printing a list
    //of Strings forward or backward.
    private static void printStringList(LinkedList<String> strings, boolean reverse) {
        if (reverse == false) {
            while (strings.isEmpty() == false) {
                System.out.print(strings.pop()) ;
            }
        }
        else { //if (reverse == true)
            while (strings.isEmpty() == false) {
                System.out.print(strings.removeLast()) ;
            }
        }
    }


//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawAnIsoscelesTriangle(n - 1, true, 1);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawADiamondWithName(n, "Adam");
    }

    private static void drawADiamondWithName(int n, String name) {

        int diamondOffset = 0;
        int nameOffset = 0 ;

        if (name.length() > n) {
            diamondOffset = name.length() - n ;
        }
        else if (n > name.length()) {
            nameOffset = n - name.length() ;
        }

        drawAnIsoscelesTriangle(n - 1, false, diamondOffset);
        drawName(name, nameOffset) ;
        drawAnIsoscelesTriangle(n - 1, true, diamondOffset);
    }

    private static void drawName(String name, int offset) {
        for (int i = 0; i < offset; i++) {
            System.out.print(' ') ;
        }
        System.out.println(name) ;
    }
}
