package com.company;
/*
 * According to Oxford English Corpus and COCA, “the” is the most common word used
 * while "be" is the second common word in English.
 * Write a program to print whatever user entered but replace "the" with "BE".
 * Use .split() method.
 */

import java.util.Scanner;

public class ReplaceCommonWord {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        String result, inStr;
        String[] inStrArray;

        do {
            result = "";
            System.out.println("Enter your text or 'q' to quit:");
            inStr = keybd.nextLine();

            if (inStr.equalsIgnoreCase("q"))
                break;

            // check for "the" usage
            inStrArray = inStr.split("the");

            for (String a : inStrArray)
                result = result + a + "BE";

            // remove last "BE" from the result
            if ((result.length() > 2) && (result.contains("BE")))
                result = result.substring(0, result.length() - 2);

            System.out.println(result);

        } while (true);
    }
}