package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Create {

    public static void main(String[] args) {
	// write your code here
        /*Declare and print the integer arrays below:
        number of positive numbers
        number of negative numbers
        number of odd numbers
        number of even numbers

        **Note: Arrays class needs to be imported
        */

        Scanner input=new Scanner(System.in);
        int[] positiveNum={1,2,3,4,5};
        int[]negative ={-1,-2,-3,-4,-5};

        int[] oddNum={1, 3, 5, 7, 9};
        int[] evenNum={ 0, 2, 4, 6, 8};


        System.out.println ("Positive Number: "+Arrays.toString(positiveNum));
        System.out.println ("Negative Number: "+Arrays.toString(negative));
        System.out.println("Odd Number:"+Arrays.toString(oddNum));
        System.out.println("Even Number:"+Arrays.toString(evenNum));




     }
}
