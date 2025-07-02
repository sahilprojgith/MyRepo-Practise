package AdvJav.adv;

class Paresh extends Thread{
    public void run(){
        System.out.println("Data Science");
        int e = 0;
        while (e <= 400) {
            System.out.println("Jio");
            e++;
        }
    }
}

class Shirke extends Thread{
    public void run(){
        System.out.println("Intern");
        int e = 0;
        while (e <= 400) {
            System.out.println("Full Stack");
            e++;
        }
    }

}

public class thread2 {
    public static void main(String[] args) {
        Paresh adesh = new Paresh();
        Shirke inamdar = new Shirke();
        adesh.start();
        inamdar.start();
    }
}
