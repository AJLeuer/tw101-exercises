
package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.GuessingGame ;

import java.io.PrintStream;
import java.io.InputStream ;
import java.util.ArrayList;
import java.util.InputMismatchException ;
import java.util.Random;
import java.util.Scanner ;

/**
 * Created by Adam on 2/22/16.
 */
public class ImprovedGuessingGame extends GuessingGame {

    private ArrayList<Integer> guesses ;


    public ImprovedGuessingGame(InputStream input, PrintStream output) {
        super(input, output) ;
    }

    @Override
    protected void initializeGame() {
        super.initializeGame() ;
        guesses = new ArrayList<Integer>() ;
    }

    @Override
    public void play() {
        initializeGame() ;
        int guess ;

        while (true) {

            output.println("Enter a number between 1 and 100.") ;
            guess = retrieveUserInput() ;
            guesses.add(guess) ;

            if (guess < secretNumber) {
                output.println("Too low.") ;
            }
            else if (guess > secretNumber) {
                output.println("Too high.") ;
            }
            else if (guess == secretNumber) {
                output.println("You win!") ;
                output.println() ;
                output.println("In order, your guesses were:") ;
                output.println(guesses) ;
                break ;
            }
        }
    }

    private int retrieveUserInput() {

        int input ;

        while (true) {
            try {
                input = inputReader.nextInt() ;
                return input ;
            }
            catch (NumberFormatException e) {
                inputReader.nextLine() ; //seems to fix a bug where inputReader doesn't pause to wait for input
                output.println("Illegal input. Please enter a valid integer.") ;
            }
            catch (InputMismatchException e) {
                inputReader.nextLine() ;
                output.println("Illegal input. Please enter a valid integer.") ;
            }
        }
    }
}
