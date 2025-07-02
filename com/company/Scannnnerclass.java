package com.company;
import java.util.Scanner; // imported scanner class

public class Scannnnerclass {

    public static void main(String[] args) {

        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
     /*   System.out.println("Enter number 1");
        int a = sc.nextInt();                   // inputs a number -- next int you can also call nextFloat()
        System.out.println("Enter number 2");
        int b = sc.nextInt();                      // inputs another number
        int sum = a + b;                       // add two numbers
        System.out.println("The sum of these numbers is");
        System.out.println(sum);  // sum is addition of numbers in 14 th line - recalled sum
        */
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);             // when you want to ensure validity of expression
    }
}
