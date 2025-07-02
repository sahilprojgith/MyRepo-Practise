package com.company;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String var = "Tom Hanks";


        switch (var) {
            case "Tom Hanks" -> System.out.println("Forrest Gump");
            case "Aamir Khan" -> System.out.println("3 Idiots");
            default -> System.out.println("Null Void");
        }

    }




}

/*
        int Lead;
        System.out.println("Enter the Character");
        Scanner sc = new Scanner((System.in));
        Lead = sc.nextInt();

        switch (Lead){
            case 1:
                System.out.println("Forrest Gump");
                break;
            case 2:
                System.out.println("Matrix");
                break;
            case 3:
                System.out.println("The Mirror");
                break;
            case 4:
                System.out.println("Cinema Paradiso");
                break;
            case 5:
                System.out.println("3 idiots");
                break;
            default:
                System.out.println("Null");
        }*/

/*
        int age;
        System.out.println("Enter your Age");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("Welcome to Fight Club");
                break;     // if I didn't put break all this cases will be printed till default
            case 21:
                System.out.println("Get used to it");
                break;
            case 25:
                System.out.println("there is no Tyler Durden it's just your daydreams");
                break;
            case 30:
                System.out.println("Enjoy your Life");
                break;
            case 35:
                System.out.println("Welcome to Normal Life");
                break;
            default:
                System.out.println("Live in Reality");

        } */

   /*
        if(age>50){                                   // this is called else if ladder
            System.out.println("You are a Experienced Driver");
        }
        else if(age>40){
            System.out.println("Ypu are a Good Driver");
        }
        else if(age>30){
            System.out.println("Ypu are a Learned Driver");
        }
        else {       // Remember you cant do else(i>20) like that you have to leave it else{}
            System.out.println("Ypu are a Learning Driver");
        } */