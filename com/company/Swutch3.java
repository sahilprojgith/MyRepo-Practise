package com.company;
import java.util.Scanner;

public class Swutch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wrestler = "Cody Rhoades";

        switch (wrestler){
            case "Roman Reigns":
                System.out.println("Roman Empire");
                break;
            case "Seth Rollins":
                System.out.println("Freakin Rollins");
                break;
            case "Cody Rhoades":
                System.out.println("American Nightmare");
                break;
            default:
                System.out.println("Champion");
        }


    }
}
