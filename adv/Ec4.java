package AdvJav.adv;

import java.util.Scanner;

class Dad extends Exception{
    @Override
    public String toString() {
        return "I must work more Harder";
    }

    @Override
    public String getMessage() {
        return "I am stupid";
    }
}

public class Ec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll the dice on Ludo");
        int a = sc.nextInt();
        if( a< 6){
            System.out.println("Your moves ahead are" + a + " steps.");
            System.out.println(a);
            try {
               throw new ArithmeticException();
            }
            catch (Exception e ){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }

        }
    }
}
