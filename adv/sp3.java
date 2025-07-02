package AdvJav.adv;

import java.util.Scanner;

public class sp3 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 32;
        marks[2] = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number : ");
        int ind = sc.nextInt();

        System.out.println("Enter the number divisible");
        int number = sc.nextInt();
        try {
            System.out.println("The value is " + marks[ind]);
            System.out.println("The value after division will be  " + marks[ind]/number);
        }
        catch (ArithmeticException e ){
            System.out.println("we are extremely sorry ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("we are extremely sorry ");
            System.out.println(e);
        }catch (Exception e ){
            System.out.println("we are extremely sorry ");
            System.out.println(e);
        }


    }
}
