package AdvJav.adv;

class Pooka extends Thread{
    Pooka(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while (i<=20) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Chika extends Thread{
    Chika(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<=10) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}

public class ThreadsPractise {
    public static void main(String[] args) {
        Pooka poo = new Pooka("Print");
        Chika chi = new Chika("Set");
        poo.setPriority(1);
        System.out.println(poo.getPriority());
        poo.start();

        chi.start();
        System.out.println(Thread.currentThread().getState());

    }
}
