package com.company;

public class VariableArguments {

 /*   static int sum(int a, int b){     // rather than Repeating method Overloading use Var args (...)
        return a + b;
    static int sum(int a, int b, int c){   // By using var args you can input multiple arrays
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

  */
    static int sum(int...arr){  // Available as int[] arr
        int result = 0;
        for(int a: arr){
            result += a;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Shawshank");
        System.out.println("The sum of 4 and 5 is :" + sum(4,5));
        System.out.println("The sum of 3,4 and 5 is :" + sum(3,4,5));
        System.out.println("The sum of 2,3,4 and 5 is :" + sum(2,3,4,5,6,7));
    }
}






