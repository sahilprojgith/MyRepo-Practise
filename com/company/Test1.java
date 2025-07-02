package com.company;            // will use scanner clas  cause containing
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {     // to calculate Cbse percentage Board exams, 5 subjects to be taken as input
        System.out.println("Test 1");
        System.out.println("Percentage of total Marks");


        Scanner sc = new Scanner(System.in);// System.in means input system se padhlo.
        System.out.println("Total Marks");

        float TotalMarks = sc.nextInt();
        System.out.println("Enter Marks Obtained in Subject 1");
        float a = sc.nextInt();
        System.out.println("Enter Marks Obtained in Subject 2");
        float b = sc.nextInt();
        System.out.println("Enter Marks Obtained in Subject 3");
        float c = sc.nextInt();
        System.out.println("Enter Marks Obtained in Subject 4");
        float d = sc.nextInt();
        System.out.println("Enter Marks Obtained in Subject 5");
        float e = sc.nextInt();
        System.out.println("Marks Obtained in all Subjects = ");

        float sum = a + b + c + d + e ;
        System.out.println(sum);

        System.out.println("Out of = ");
        System.out.println("Total Marks");

        System.out.println("Percentage = ");
        float Percentage = sum*100/TotalMarks;
        System.out.println(Percentage);

    }
}
// Guess you have to imagine how wil be the output ,so you have clear vision of what you do
