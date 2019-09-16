package com.company;

import java.util.Scanner;
/*Complete initialized array/Scanner values and use for-loops to iterate and print out sum of entry*/
public class Extend {
    public static void main(String[] args) {
        int numList[] = new int[10];
        int total = 0;
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Enter any 10 random numbers: ");
        }
        for (int i = 0; i < 10; i++)
            total += input.nextInt();
        {
            System.out.println("The sum of these numbers is: " + total);
        }

    }
}
