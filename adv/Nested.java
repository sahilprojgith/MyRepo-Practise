package AdvJav.adv;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 231;
        marks[1] = 233;
        marks[2] = 236;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("enter the value:");
            int ind = sc.nextInt();
            try {
                System.out.println("Vannakam to Greenland : ");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index doesn't exist.");
                    System.out.println("Exception in level 2");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
                System.out.println(e);
            }
        }
        System.out.println("Thanks");
    }
}
