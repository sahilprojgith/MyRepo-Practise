package com.company;

import java.util.Scanner;

public class Pract7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = sc.nextInt();
        if (N % 2 == 0 && N >= 2 && N <= 5 ) { // 0 is the remiainder of n%2 here,
            System.out.println("Not Weird");

        }

        else if(N % 2 == 0 && N>20){
            System.out.println("Not Weird");
        }

        else if (N % 2 == 0 && N >= 6 && N <= 20) { // N is greater than 6 && N is smaller than 20.
            System.out.println("Weird"); // pseudo code ka kamaal.
        }
        else {
            System.out.println("Weird");
        }
        sc.skip("Pattern");
        sc.close();

    }
}
