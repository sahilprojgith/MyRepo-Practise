package AdvJav.adv;
import java.util.Scanner;

public class Specexcept2 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 34;
        marks[1] = 12;
        marks[2] = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int ind = sc.nextInt();

        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        try{
            System.out.println("The value is" + marks[ind]);
            System.out.println("The value is" + marks[ind]/number);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We are sorry cause");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("We are sorry cause");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("We are sorry cause");
            System.out.println(e);
        }
    }
}
