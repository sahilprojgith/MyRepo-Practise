package com.company;
import java.util.Scanner;

public class Test2Part2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("TAX :");

        float tax = 0;
        float income = sc.nextFloat();
        if(income<2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income>=5.0f){
            tax = tax + 0.05f*(income -2.5f);
        }
        else if(income>5.0f && income<=10.0f){
            tax = tax + 0.05f*(5.0f -2.5f);
            tax = tax + 0.20f*(income - 5.0f);
        }
        else if(income > 10.0f){
            tax = tax + 0.05f*(income -2.5f);
            tax = tax + 0.2f*(10.0f - 5.0f);
            tax = tax + 0.3f*(income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is:" + tax);
        // New
        System.out.println("CWH Tax:");

        float taxi = 0;
        float incomei = sc.nextFloat();
       if(incomei<=2.5){
            taxi = taxi + 0;
       }
        else if(incomei>2.5f && incomei <= 5f){
            taxi = taxi + 0.05f * (incomei - 2.5f);
        }
       else if(incomei>5f && incomei <= 10.0f){
            taxi = taxi + 0.05f * (5.0f - 2.5f);
            taxi = taxi + 0.2f * (incomei - 5f);
       }
        else if(incomei>10.0f){
           taxi = taxi + 0.05f * (5.0f - 2.5f);
           taxi = taxi + 0.2f * (10.0f - 5f);
            taxi = taxi + 0.3f * (incomei - 10.0f);
        }

       System.out.println("The total tax paid by the employee is: " + taxi);

        // Problem 6
/*
        String website = sc.next();
       if(website.endsWith(".org")){
           System.out.println("This is an organizational website");
       }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
       }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
   */


    }
}
