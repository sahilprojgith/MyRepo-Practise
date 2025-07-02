package AdvJav.adv;

class Ganpath extends Thread{
    public Ganpath(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i<=50){
        System.out.println("Thank you " + this.getName());
        i++;
        }
    }
}

public class pririty {
    public static void main(String[] args) {
        Ganpath gum = new Ganpath("Pan");
        Ganpath gum1 = new Ganpath("P");
        Ganpath gum2 = new Ganpath("P00");
        Ganpath gum3 = new Ganpath("Pa");
        Ganpath gum4 = new Ganpath("Pant(Most Important)");
        gum4.setPriority(Thread.MAX_PRIORITY);
        gum1.setPriority(Thread.MIN_PRIORITY);
        gum.start();
        gum1.start();
        gum2.start();
        gum3.start();
        gum4.start();

    }
}
