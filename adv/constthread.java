package AdvJav.adv;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 40;
        System.out.println("Thansks");
        while (true){
           // System.out.println("i am  a thread");
        }
    }
}

public class constthread {
    public static void main(String[] args) {
        MyThr tr = new MyThr("Darcula");
        MyThr tr2 = new MyThr("Ram Mandir");
        tr.start();
        tr2.start();
        System.out.println("the id of thread is " + tr.getId());
        System.out.println("the id of thread is " + tr.getName());
        System.out.println("the id of thread is " + tr2.getId());
        System.out.println("the id of thread is " + tr2.getName());
    }
}
