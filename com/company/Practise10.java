package com.company;
/*
Take input of age of 3 people by user and determine oldest and youngest among them.
Sahil -21
Shreeyansh - 8
Sanajy - 52
 */
import java.util.Scanner;

public class Practise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of Sahil");
        int Sahil = scanner.nextInt();
        System.out.println("Enter the age of Shreeyansh");
        int Shreeyansh = scanner.nextInt();
        System.out.println("Enter the age of Sanjay");
        int Sanjay = scanner.nextInt();

        if(Sahil>=Shreeyansh && Sahil>=Sanjay) {
            System.out.println("Sahil is the Biggest");
        }
        else if (Shreeyansh >= Sanjay && Shreeyansh>=Sahil) {
            System.out.println("Shree is the Biggest");
        }
        else if(Sanjay>=Sahil && Sanjay>=Shreeyansh){
            System.out.println("Sanjay is bigger");
        }
        else {
            System.out.println("Aadhar crad Fraud");
        }
    }
}
