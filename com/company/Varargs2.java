package com.company;

public class Varargs2 {
    static int tum(int ...atr){
        int ali =0;
        for(int r: atr){
            ali += r;
        }
        return ali;
    }

    public static void main(String[] args) {
        System.out.println("Record Wins --");
        System.out.println("Values are :" + tum(6,8,8,78));
    }
}

/*   static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
*/