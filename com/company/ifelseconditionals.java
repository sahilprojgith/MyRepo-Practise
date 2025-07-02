package com.company;
import java.util.Scanner;

public class ifelseconditionals {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String Non = sc.nextLine();
        if(Non.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }
}

/*  //5
      String Non = sc.nextLine();
      if(Non.isEmpty()){
          System.out.println("Empty");
      }
      else{
          System.out.println("Not Empty");
      } */


/*
 //4
       Scanner sc = new Scanner(System.in);
       String website = sc.next();  // Need to know More About This sc.Next()
       if(website.startsWith("www")){
           System.out.println("This is World wide Web");
       } else if (website.startsWith("xxx")) {
           System.out.println("This is a Porn Website");

       }else
       {
           System.out.println("Normal Website");
       } */

/*
//3
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is a organizational Website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is a Indian website");

        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial Website");

        } */

/*
 2
    public static void main(String[] args) {
        int FoodDeliveries = 45;
        if(FoodDeliveries >= 23){
            System.out.println("Extraordinary Performance");

        } else if (FoodDeliveries == 23) {
            System.out.println("Perfect! Mamma Mia");
        }else
        {
            System.out.println("Work More");
        } */
/*
//1
        float  Race = 2.0007f;
        if(Race<=3.10000){
            System.out.println("The Driver has made a new record :" + " " + Race);
        }
        else{
            System.out.println("Driver hasn't been upto mark yet");
        }

*/
/* int age = 26;
        if( age > 18){
            System.out.println("Yes you can Drive");
        }
        else{
            System.out.println("No You cant drive");
        }
        System.out.println();

        */
