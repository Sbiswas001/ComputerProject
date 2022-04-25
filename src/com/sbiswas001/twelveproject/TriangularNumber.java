package com.sbiswas001.twelveproject;

import java.util.Scanner;

/**
 * This class checks if a number is triangular or not.
 * A number is triangular if it is formed by the addition of
 * consecutive sequence of integers starting from 1.
 * @author Sayan Biswas
 * @version 23.04.2022
 */
public class TriangularNumber {

    /**
     * Stores the number
     */
    private int x;

    /**
     * Initializes instance variables
     */
    private TriangularNumber() {
        x=0;
    }

    /**
     * Inputs number from user
     */
    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter natural number: ");
        x = Integer.parseInt(sc.next());
        if(x < 1) {
            System.out.println("Wrong input! Try again.");
            input();
        }
    }

    /**
     * This method checks if a number is triangular or not.
     * A number is triangular if it is formed by the addition
     * of consecutive sequence of integers starting from 1.
     * Let x be the sum of n consecutive numbers from 1.
     * So, x=n*(n+1)/2, where n is a natural number.
     * Calculating we get, n=-0.5+-(Math.sqrt(1+8*x))/2
     * If n is a natural number then x is a triangular number.
     * @return true or false
     */
    private boolean triangularCheck() {
        double n1, n2;
        n1 = -0.5+(Math.sqrt(1+8*x))/2;
        n2 = -0.5-(Math.sqrt(1+8*x))/2;
        return n1 % 1 == 0 || n2 % 1 == 0;
    }

    /**
     * Calls other methods
     * @param args Arguments passed to main method
     */
    public static void main(String[] args) {
        TriangularNumber ob = new TriangularNumber();
        ob.input();
        System.out.println(ob.triangularCheck() ?
                "Number is a triangular number." :
                "Number is not a triangular number.");
    }

}
