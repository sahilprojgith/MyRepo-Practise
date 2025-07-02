package AdvJav.adv;

import java.util.ArrayDeque;

public class ArrayDQ {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(4);
        ad1.add(47);
        ad1.addFirst(34);
        ad1.addLast(56);
        System.out.println(ad1);
        System.out.println(ad1.getLast());
    }
}
