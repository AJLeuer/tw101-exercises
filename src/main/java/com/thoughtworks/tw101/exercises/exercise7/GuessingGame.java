package com.thoughtworks.tw101.exercises.exercise7;

import java.io.PrintStream;
import java.io.InputStream ;
import java.util.Random;
import java.util.Scanner ;

/**
 * Created by Adam on 2/22/16.
 */
public class GuessingGame {

    protected Scanner inputReader ;
    protected PrintStream output ;
    protected int secretNumber ;


    public GuessingGame(InputStream input, PrintStream output) {
        this.inputReader = new Scanner(input) ;
        this.output = output ;
        initializeGame() ; //will initialize other member vars
    }

    protected void initializeGame() {
        Random rand = new Random() ;
        secretNumber = rand.nextInt(100) + 1 ;
    }

    public void play() {
        initializeGame() ;
        int guess ;

        while (true) {

            output.println("Enter a number between 1 and 100.") ;
            guess = inputReader.nextInt() ;

            if (guess < secretNumber) {
                output.println("Too low.") ;
            }
            else if (guess > secretNumber) {
                output.println("Too high") ;
            }
            else if (guess == secretNumber) {
                output.println("You win!") ;
                break ;
            }
        }
    }
}
