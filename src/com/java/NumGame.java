package com.java;

import java.util.Random;
import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Java eGame:");
        System.out.println("Select a number between 1 to 100:");
        int rand = random.nextInt(100-1+1) + 1;
        int numberOfTries = 0;
        boolean trueFalse = true;
        while (trueFalse){
            int a = S.nextInt();
            numberOfTries++;
            if(a == rand) {
                trueFalse = false;
                System.out.println("Now you are floating:");
            }
            else if(rand>a)
                System.out.println("you are deeping");
            else
                System.out.println("you are flying");
        }
        System.out.println("Hurray! you have done in "+numberOfTries);
    }
}


