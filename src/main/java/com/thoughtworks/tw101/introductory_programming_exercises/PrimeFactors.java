package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {

        List<Integer> factors = new ArrayList<Integer>() ;
        List<Integer> potentialFactors = findPrimes(n) ;

        for (int i = 0; (i < potentialFactors.size()) && (potentialFactors.get(i) <= Math.sqrt(n)) ; i++) {
            final int prime = potentialFactors.get(i) ;

            if ((n % prime) == 0) {
                factors.add(prime) ;
            }
        }

        return factors;
    }

    /**
     * Method for finding prime numbers up to n. Uses the
     * <a href="https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">Sieve of Eratosthenes</a>.
     */
    private static List<Integer> findPrimes(int n) {

        List<Integer> numbers = new ArrayList<Integer>() ;

        //create a list of consecutive integers from 2 through n: (2, 3, 4, ..., n)
        for (int i = 2 ; i <= n ; i++) {
            numbers.add(i) ;
        }

        return findPrimesHelper(0, numbers) ;
    }


    /**
     *
     * @param index The position of the current integer used to eliminate non-primes in the list
     * @param numbers A list of consecutive numbers, starting at 2, from which only the primes should be returned
     * @return A List<Integer> with all the primes found in numbers
     */
    private static List<Integer> findPrimesHelper(int index, List<Integer> numbers) {

        //base case
        if (index >= (numbers.size() - 1)) {
            return numbers ;
        }

        final int p = numbers.get(index) ;

        //remove all multiples of p found in the list (except p itself)
        for (int i = 0; i < numbers.size() ; i++) {

            final int number = numbers.get(i) ;
            //skip p itself in the list
            if (number == p) {
                continue ;
            }
            if ((number % p) == 0) {
                numbers.remove(i) ;
                i-- ; //so we don't skip a number in the list after removing
            }
        }

        index++ ;
        //search recursively
        return findPrimesHelper(index, numbers) ;
    }
}
