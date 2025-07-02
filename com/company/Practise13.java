package com.company;

/*
Write a program to check whether a  entered character is lowercase ( a to z ) or uppercase ( A to Z ).
 */

import java.util.Scanner;

public class Practise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char input = sc.next().charAt(0);
        if(input>='a' && input<='z'){
            System.out.println("The character is lowercase");
        } else if (input>='A' && input <= 'Z') {
            System.out.println("The character is UpperCase");
        }else {
            System.out.println("Invalid code");
        }
    }
}
