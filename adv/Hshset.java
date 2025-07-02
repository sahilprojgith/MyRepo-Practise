package AdvJav.adv;

import java.util.HashSet;

public class Hshset {
    public static void main(String[] args) {
        HashSet<Integer> sde = new HashSet<>(6,0.75f);
        sde.add(11);
        sde.add(3);
        sde.add(4);
        sde.add(34);
        sde.add(34);
        System.out.println(sde);

    }
}
