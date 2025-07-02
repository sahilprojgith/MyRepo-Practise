package com.company;
import java.util.Scanner;

public class Test2conditionalsandswitchcases {
    public static void main(String[] args) {

        byte m1,m2,m3;// int ki jagah byte
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Thugnomics");
        m1 =sc.nextByte();
        System.out.println("Enter your marks in Pansatgiri");
        m2 =sc.nextByte();
        System.out.println("Enter your marks in Specialization in Hornyness");
        m3 =sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Overall Percentage is :" + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations you have passed the exam");
        }
        else{
            System.out.println("You failed, better luck next time");
        }


        System.out.println();
    }
}


 /*
        int Percentage;
        System.out.println("Enter the Percentage");

        Scanner sc = new Scanner(System.in);
        Percentage = sc.nextInt();

        if(Percentage>40){
            System.out.println("You have passed the exam");
        }
        else{
            System.out.println("You failed the exam");
        }

        */