package com.company;
import java.util.Scanner;

public class Test1selfnew {
    public static void main(String[] args) {
        System.out.println("Calculating Percentage of Subjects(Marks)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Total Marks out of :");

        float TotalMarks = sc.nextInt();

        System.out.println("Enter Marks obtained in Subject 1");
        float a = sc.nextInt();
        System.out.println("Enter Marks obtained in Subject 2");
        float b = sc.nextInt();
        System.out.println("Enter Marks obtained in Subject 3");
        float c = sc.nextInt();
        System.out.println("Enter Marks obtained in Subject 4");
        float d = sc.nextInt();
        System.out.println("Enter Marks obtained in Subject 5");
        float e = sc.nextInt();

        float sum  = a + b + c + d + e ;
        System.out.println(sum);

        System.out.println("Out of ");
        System.out.println("500");
        System.out.println("Total Percentage");

        float Percentage = sum*100/TotalMarks ;
        System.out.println(Percentage);
        System.out.println("Cogratulations");


    }
}
