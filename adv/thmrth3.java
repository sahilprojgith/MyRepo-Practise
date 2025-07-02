package AdvJav.adv;

class Window extends Thread{
    Window(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<=100){
        System.out.println("Ran away");
            try {
                Thread.sleep(78);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class Door extends Thread{
    Door(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<=100){
            System.out.println("Came in");
            i++;
        }
    }
}



public class thmrth3 {
    public static void main(String[] args) {
        Window window = new Window("Bet");
        Door foor = new Door("Cet");
        window.start();

       /*try {
            window.join();
        }
        catch (Exception t){
            System.out.println(t);
        }
        */

        foor.start();

    }
}
