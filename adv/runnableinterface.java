package AdvJav.adv;

class MyThreadRunnnable implements Runnable{
    public void run(){
        int i = 0;
        while (i<40) {
            System.out.println("I am a thread not a thread");
            i++;
        }
    }
}

class MyThreadRunnnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<=40) {
            System.out.println("cody am a thread not a jobber");
            i++;
        }

    }
}

public class runnableinterface {
    public static void main(String[] args) {

        MyThreadRunnnable bullet1 = new MyThreadRunnnable();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnnable2 bullet2 = new MyThreadRunnnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
