package com.company;

//Calculate the Sum of All Elements in an Array
//Calculate the Average of All Elements in an Array

public class arrays6 {
    public static void main(String[] args) {
        int [] arr = { 23,34,56,12,31};
        int sum = 0;

        for(int i = 0; i < arr.length ;i++){
            sum+=arr[i];
        }

       double average = (double) sum/arr.length ;

        System.out.println("The sum of all elements in the array is : " + average); //sum if sum of all elements.


    }
}
