package AdvJav.adv;

class Pikachu extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=100;i++){
            System.out.println("Pika pika pikachu");
        }
    }
}

class Raichu extends Thread{
    @Override
    public void run() {
        for (int j = 0 ; j<=100; j++){
            System.out.println("Rai rai Rai");
//            try {
//                Thread.sleep(89);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

public class Thdpractise2 {
    public static void main(String[] args) {
        Pikachu thr = new Pikachu();
        Raichu thr2 = new Raichu();
        thr.start();
//        try {
//            thr2.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        thr2.start();
    }
}
