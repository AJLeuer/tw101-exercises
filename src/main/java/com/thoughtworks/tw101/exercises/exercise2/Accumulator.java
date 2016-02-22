package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int incrementCalls = 0 ;

    public void increment() {
        incrementCalls++ ;
    }

    public void total() {
        System.out.println(incrementCalls) ;
    }
}
