package AdvJav.adv;

class Mima{
    public int x =5;
    protected int y = 45;
    int z = 56;
    private int a = 78;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class accessmodifiers {
    public static void main(String[] args) {
        Mima mm = new Mima();
        mm.meth();
    }
}
