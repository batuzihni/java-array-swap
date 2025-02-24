package com.mycompany.softwaredev2week4exercise3;

import java.util.Scanner;

public class Softwaredev2week4exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};
        
        System.out.println("Enter first index: ");
        int index_1 = input.nextInt();
        
        // Ensure the first index is valid
        if (index_1 < 0 || index_1 >= array.length) {
            System.out.println("Invalid index 1.");
            input.close();
            return;
        }
        
        System.out.println("Enter second index: ");
        int index_2 = input.nextInt();
        
        // Ensure the second index is valid
        if (index_2 < 0 || index_2 >= array.length) {
            System.out.println("Invalid index 2.");
            input.close();
            return;
        }
        
        // Swapping logic
        String temp = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = temp;
        
        // Output the modified array
        System.out.println("Array after swapping:");
        for (String name : array) {
            System.out.println(name);
        }
        
        // Close scanner
        input.close();
    }
}
