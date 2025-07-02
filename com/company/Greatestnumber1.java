package com.company;

import java.util.Scanner;

/*
Take two int values from user and print greatest among them.
 */
public class Greatestnumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Take input from the System.
        System.out.println("Enter value a :");
        int a = scanner.nextInt();
        System.out.println("Enter value b");
        int b = scanner.nextInt();
        if(a<b){        // B is greater than A / A is smaller than B
            System.out.println("b is the greatest integer");
        }
        else {
            System.out.println("a is greatest Integer");
        }

    }
}
