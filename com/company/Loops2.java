package com.company;

public class Loops2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

/*
        //write a program to calclate the sum of a multiplication table
        int n = 8;
        int sum = 0;
        for (int i =0; i <=10; i ++){
           sum += n*i ;
        }
        System.out.println(sum);
*/

 /*
      int n = 5; //Factorial
      int i = 1;
      int factorial = 1;
      while(i<=n){
          factorial *= i;
          i++;
      }
        System.out.println(factorial);

         */

/*// Multiplication Table
        int n = 6;
        for (int i =0; i <=10; i ++){
            System.out.printf("%d  X % d = %d\n", n ,i ,n*i );
        } */

 /*
        int sum = 0;
        int n = 4;   // First 4 even numbers
        for(int i = 0; i < n; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of even numbers is : ");
        System.out.println(sum);
*/

/*
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        } */