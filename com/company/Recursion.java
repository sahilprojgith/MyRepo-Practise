package com.company;

public class Recursion {  // Recursion Basics
    static int factorial(int n){  // Factorial 0 is 1.
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {

        int n = 5;  //Enter the Number


        System.out.println("The value of factorial N is : " + factorial(n));
        System.out.println("The value of factorial N is : " + factorial_iterative(n));
    }
}
