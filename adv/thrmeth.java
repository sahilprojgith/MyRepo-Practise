package AdvJav.adv;

class Madomosel3 extends Thread{
    Madomosel3(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i<=100) {
            System.out.println("Popat");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);    // it sleeps for 455 milliseconds.
            }
            i++;
        }
    }
}

class Madomosel4 extends Thread{
    Madomosel4(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<=100) {
            System.out.println("Parrot");
            i++;
        }
    }
}

public class thrmeth {
    public static void main(String[] args) {
        Madomosel3 feku = new Madomosel3("Koran");
        Madomosel4 deku = new Madomosel4("Arjun");
        feku.start();
      /*  try {
            feku.join();
        }
        catch (Exception r){
            System.out.println(r);
        }*/
        deku.start();
    }
}

