package com.company;

public class RelationalandLogicaloperators {  // AND, NOR , NOT operators like T & T is T and T & F is F
    public static void main(String[] args) {
        System.out.println("For logical AND");

        boolean a = true;
        boolean b = false;

        if(a && b){                      // && is AND Operation
            System.out.println("Y");
        }
        else{
            System.out.println("N"); // Same you can do with Logical OR that is ||
        }

        System.out.println("For logical OR");

        boolean c = true;
        boolean d = false;

        if(c || d){                      // || is OR Operation
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // Logical NOT
        System.out.println("For Logical NOT");
        System.out.print("Not(a) is");
        System.out.println(!a);
        System.out.println("Not(b) is");
        System.out.println(!b);





        System.out.println();
    }
}
