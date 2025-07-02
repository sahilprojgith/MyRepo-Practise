package com.company;

/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */

import java.util.Scanner;

public class Schoolifelse {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = scanner.nextInt();

        if(marks<25){
            System.out.println("Your Grade for this semester is F");
        } else if (marks>=25 && marks<=45) {
            System.out.println("Your Grade for this semester is E");
        } else if (marks>45 && marks<=50) {
            System.out.println("Your Grade for this semester is D");
        } else if (marks>50 && marks<=60) {
            System.out.println("Your Grade for this semester is C");
        } else if (marks>60 && marks<=80) {
            System.out.println("Your Grade for this semester is B");
        }else if(marks>80){
            System.out.println("Your Grade for this semester is A");
        }else {
            System.out.println("Don't Worry you Fail");
        }
    }
    }

