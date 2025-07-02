package com.company;

import java.util.Scanner;

/*
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */

public class Practise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Attendance : ");
       // double attendance = scanner.nextDouble();
        System.out.println("Number of classes held :");
        int classes = scanner.nextInt();
        System.out.println("Number of classes attended : ");
        int attended = scanner.nextInt();

        double Attendence = ((double) attended/classes)*100; // typecasted so that division could happen.
        System.out.println("Percentage of classes attended : " + Attendence + " %");
        if(Attendence>75){
            System.out.println("Yes he/she/they can attend the Exams");
        }else {
            System.out.println("Student is not allowed to sit in Exams");
        }

    }
}
