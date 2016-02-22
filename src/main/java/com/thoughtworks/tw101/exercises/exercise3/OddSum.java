package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        int sum = 0 ;

        //if start is even, increase it by 1, otherwise keep it the same
        start = ((start % 2) == 0) ? (start + 1) : start ;

        for (int i = start ; i <= end ; i += 2) {
            sum += i ;
        }

        return sum ;
    }
}
