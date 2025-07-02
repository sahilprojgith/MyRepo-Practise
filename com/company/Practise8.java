package com.company;

import java.util.Scanner;

public class Practise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity: ");
        int a = sc.nextInt();
        if((a*100)>=1000){ // 1 kg is 1000rs.- a is a*100 and if it exceeds 1000 rupee mark then discount is applicable.
            System.out.println("Discount will " + (.10%a*100) + " and the cost is - " + (a*100 - (.10%a*100)));// Total cost
        }                                                                // subracted from discount cost of 10%.
        else {
            System.out.println("Discount will not be given, does not exceede 1000 Rs mark.");
        }
    }
}
