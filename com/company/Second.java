package com.company;

public class Second {
    public static void main(String[] args) {
   int i, count = 0,sum=0;
   for(i=100;i<200;i++){
       if(i%7==0) {
           sum = sum + i;
           count++;
       }
   }
System.out.println("sum of numbers divisible by 7 are: " + sum);
        System.out.println("Total count of numbers divisible by 7 are: " + count);
    }
}