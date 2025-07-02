package com.company;

public class methods2 {
    static  int sum(int ...arr){
        int Choclate = 1;
        for(int a : arr){
            Choclate +=a;
        }
        return Choclate;
    }

    public static void main(String[] args) {
        System.out.println("Choclates are :  " + sum(45,56,67));
    }


    }

/*
    static int logic(int x, int y) { // DRY principle
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = x * y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 50;
        int b = 71;
        int c;
        // Method invocation using Object Creation
        // methods2 obj = new methods2(); // When not using static up here,
        //c = obj.logic(a,b);
        c = logic(a,b); // instead of repeating the procedure
        int a1 = 91;
        int b1 = 72;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
        */
