package AdvJav.adv;

class Madomosel extends Thread{
    Madomosel(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i<=100) {
            System.out.println("Ta t piere los inglesh");
            i++;
        }
    }
}

class Madomosel2 extends Thread{
    Madomosel2(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<=100) {
            System.out.println("Tu enbol");
            i++;
        }
    }
}

public class threadmethods {
    public static void main(String[] args) {
        Madomosel fek = new Madomosel("Koran");
        Madomosel2 dek = new Madomosel2("Arjun");
        fek.start();
        try {
            fek.join();
        }
        catch (Exception r){
            System.out.println(r);
        }

        dek.start();
    }
}
