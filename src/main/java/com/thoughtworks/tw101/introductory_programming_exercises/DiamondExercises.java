package com.thoughtworks.tw101.introductory_programming_exercises;

import java.lang.StringBuilder ;

public class DiamondExercises {
    public static void main(String[] args) {
        //drawAnIsoscelesTriangle(8, false);

        drawAnIsoscelesTriangle(10);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        drawAnIsoscelesTriangle(n, false);
    }


    // Overloaded helper method for drawAnIsoscelesTriangle(int)
    // Allows drawing an isosceles triangle upside-down
    private static void drawAnIsoscelesTriangle(int n, boolean flipped) {
        /* the length of all rows is determined by the length of the final row, which is equal
           to 2x the total number of rows minus 1 */
        int sizeOfRows = (2 * n) - 1 ;
        int currentRowStartingPosition = sizeOfRows / 2 ;

        StringBuilder output = new StringBuilder() ;

        for (int i = 0, currentRowAsterisksCount = 1 ; i < n ; i++) {

            for (int j = 0; j < currentRowStartingPosition ; j++) {
                output.append(' ') ;
            }

            for (int j = 0; j < currentRowAsterisksCount; j++) {
                output.append('*') ;
            }

            // we can just put a new line here
            output.append('\n') ;
            System.out.println() ;

            currentRowStartingPosition -= 1 ;
            currentRowAsterisksCount += 2 ;
        }
        int i = 0 ;
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {

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

    }
}
