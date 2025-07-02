package AdvJav.adv;

class Rohit extends Thread{
    Rohit(String name){
        super(name);
    }
    public void run(){
        System.out.println("Mitthu");
    }
}

public class constrthr2 {
    public static void main(String[] args) {
        Rohit bala = new Rohit("WOW");
        Rohit bala2 = new Rohit("Chiii");

        System.out.println("If it is " + bala.getId());
        System.out.println(" It is " + bala.getName());
        System.out.println(" It is " + bala2.getId());
        System.out.println(" It is " + bala2.getName());


    }
}
