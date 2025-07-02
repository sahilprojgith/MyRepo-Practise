package AdvJav.adv;

import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 2;
        marks[2] = 212;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();

        System.out.println("Enter the number");
        int number = sc.nextInt();
        try{
            System.out.println("the value at array index is" + marks[ind]);
            System.out.println("The value of array-value number is " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception occured");
            System.out.println(e);
        }
    }
}
