package com.company;

import java.util.Scanner;

public class stdinstdout {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int i = sc2.nextInt();
        double d = sc2.nextDouble();
        sc2.nextLine();  // For Strings it is necessary
        String s = sc2.nextLine();

        System.out.println("Integer is : " + i);
        System.out.println("Double is : " + d);
        System.out.println("String is : "+ s);




    }
}
