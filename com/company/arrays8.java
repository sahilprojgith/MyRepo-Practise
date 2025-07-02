package com.company;

import java.util.Scanner;
//Check if an Array Contains a Certain Value
public class arrays8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = { 2,34,89,243,1};
        System.out.println("Enter the value you want to find : ");
        int valueToFind = scanner.nextInt();
        boolean toFind = false;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == valueToFind){
                toFind = true;
                break;
            }
        }
        if(toFind){
            System.out.println("Value found " + toFind);
        }else {
            System.out.println("Not found");
        }



    }
}
/*
Scanner sc = new Scanner(System.in);
        int[] arr = { 2,34,20,83,22};
        System.out.print("Enter the number : ");
        int valueToFind = sc.nextInt();
        boolean toFind = false;

        for(int i = 0;i <= arr.length;i++){
            if(arr[i] == valueToFind){
                toFind = true;
                break; // very important
            }
        }

        if (toFind){
            System.out.println("The value is present in this array = " + valueToFind );
        }else {
            System.out.println("Not present");
        }
 */
