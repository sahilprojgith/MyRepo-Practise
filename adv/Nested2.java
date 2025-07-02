package AdvJav.adv;

import java.util.Scanner;

public class Nested2 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] =34;
        marks[1] =55;
        marks[2] =23;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Enter the values");
            int ind = sc.nextInt();
            try {
                try {
                    System.out.println("The values are :" + marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception in Level 1");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("Exception in level 2");
                System.out.println(e);
            }
        }
        System.out.println("Thanks");
        System.out.println("Fuck off");
    }
}
