package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(8, false);
        //drawAnIsoscelesTriangle(10);
        //drawADiamond(8);
        //drawADiamondWithYourName(3);
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

        for (int i = 0, currentRowAsterisksCount = 1 ; i < n ; i++) {

            for (int j = 0; j < currentRowStartingPosition ; j++) {
                System.out.print(' ') ;
            }

            for (int j = 0; j < currentRowAsterisksCount; j++) {
                System.out.print('*') ;
            }

            // we can just print a new line here
            System.out.println() ;

            currentRowStartingPosition -= 1 ;
            currentRowAsterisksCount += 2 ;
        }
    }

    private static void drawAnIsoscelesTriangle(int n, boolean flipped) {
        /* the length of all rows is determined by the length of the first/final row, which is equal
           to 2x the total number of rows minus 1 */
        final int sizeOfRows = (2 * n) - 1 ;

        int blankSpaces = flipped ? 0 : (sizeOfRows / 2) ;

        for (int i = 0; i < sizeOfRows ; i++) {
            for (int j = 0; j < blankSpaces  ; j++) {
                System.out.print(' ') ;
            }
            for (int j = 0; j < (sizeOfRows - blankSpaces); j++) {
                System.out.print('*') ;
            }

            System.out.println() ;

            blankSpaces = flipped ? (blankSpaces + 2) : (blankSpaces - 2) ;
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
