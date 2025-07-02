package com.company;

import java.util.Scanner;

/* Problem Statement -
Take values of length and breadth of a rectangle from user and check if it is square or not.
 */

public class checkSquareorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int a = sc.nextInt(); // you can only input a integer here.
        System.out.println("Enter Breadth");
        int b =sc.nextInt();
        if(a == b){
            System.out.println("Perfect Squares");
        }else {
            System.out.println("It is a rectangle");
        }

    }
}
