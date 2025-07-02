package AdvJav.adv;

import java.util.Scanner;

class Realme extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage() + " I am Bad ";
    }

    @Override
    public String toString() {
        return super.toString() + " I am Good ";
    }
}

public class Ec3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value : ");
        int a = sc.nextInt();
        if(a<99){
            try {
                throw new ArithmeticException("I am a Exception");
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
            }
        }

    }
}
