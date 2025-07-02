package AdvJav.adv;
import java.util.*;

public class arriaylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(34);
        l2.add(56);
        l2.add(43);
        l2.add(30);

        l1.add(4);
        l1.add(7);
        l1.add(6);
        l1.add(5);
        l1.add(0,4); // Added in 0th element
        l1.add(0,1);  // Again added in 0th element so that bucket Principle.
        l1.addAll(0,l2);  // 0 se add karega, l2 ko.
        System.out.println(l1.contains(23));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,567); // Kahi se bhi ghusa sakte ho.
        l1.remove(4);
      //  l1.clear();
        for (int i = 0; i<l1.size();i++) {
            System.out.println(l1.get(i));
            System.out.print(" ");
        }
    }
}
