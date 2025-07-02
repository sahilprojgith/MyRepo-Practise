package com.company;

public class methods3 {
     static int demic(int a, int b){
        int z = 0;
        if (a>b){
            System.out.println("The number is greater than this");
        }
        else {
            System.out.println("The number is smaller");
        }

        return z;
    }
    static int tiomic(int d, int e){
        int z1 = 0;
        if (d>e){
            z1 = d + e;
        }
        else {
            z1= d-e;
        }
        return z1;
    }
    
    static int femic(int g, int j){
         int y = 0;
         if(g>j){
             System.out.println("kiomin");
         }
         else {
             System.out.println("L");
         }
        return y;
    }


    public static void main(String[] args) {
         int a = 3;
         int b =5;
         int c ;
         c= demic(a,b);
        System.out.println(c);
         int d = 23;
         int e = 34;
         int f1;
         f1= tiomic(d,e);
        System.out.println(f1);
        int g = 23;
        int j = 45;
        int y = femic(g, j); // instead of declaring int y and then doing it
        System.out.println(y);
        System.out.println("End");

    }
}
