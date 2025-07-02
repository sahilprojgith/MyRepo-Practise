package AdvJav.adv;

import java.util.ArrayList;
import java.util.Scanner;

public class generikks {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
       // arrayList.add("string1");
        arrayList.add(45);
        arrayList.add(646);
       // arrayList.add(new Scanner(System.in));

        int a =  arrayList.get(2);
        System.out.println(a);
    }
}
