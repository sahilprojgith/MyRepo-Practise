package com.company;

import java.util.Scanner;
/*
A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
 */
public class Practise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter the Years of Experience");
        int yearsOfExperience = sc.nextInt();
        if(yearsOfExperience>5){
           // double bonus = 0.05 * salary;
           // System.out.println(bonus);
            System.out.println("Your Bonus is " + (.5%yearsOfExperience*10000));
        }else {
            System.out.println("Wait till you complete 5 years");
        }
    }
}
