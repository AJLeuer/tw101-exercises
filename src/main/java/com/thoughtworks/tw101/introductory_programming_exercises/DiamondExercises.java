package com.thoughtworks.tw101.introductory_programming_exercises;

import java.lang.StringBuilder ;
import java.util.Arrays;
import java.util.LinkedList;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(8);

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
                /* the length of all rows is determined by the length of the final row, which is equal
           to 2x the total number of rows minus 1 */
        int sizeOfRows = (2 * n) - 1 ;
        int currentRowStartingPosition = sizeOfRows / 2 ;

        StringBuilder outputLine = new StringBuilder() ;
        LinkedList<String> output = new LinkedList<String>() ;

        for (int i = 0, currentRowAsterisksCount = 1 ; i < n ; i++) {

            for (int j = 0; j < currentRowStartingPosition ; j++) {
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

        printStringList(output, false);
    }

    //Helper method for drawAnIsoscelesTriangle(int). Allows printing a list
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
