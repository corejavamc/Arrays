package com.company;

public class Complete {
    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Declare sum variable, assign it initial value of zero
    int sum = 0;

    // Loop through array
    for (int i = 0; i < numbers.length; i++) {
        // Add each number in the array to "sum"
        sum = sum + numbers[i];
    }

    // Print out the sum
    System.out.println(sum);

}
}

