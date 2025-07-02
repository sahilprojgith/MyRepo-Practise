package AdvJav.adv;

class Sonam extends Thread{
    Sonam(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<=100){
            System.out.println("hey there " + this.getName());
            i++;
        }
    }
}

public class priority2 {
    public static void main(String[] args) {
        Sonam sahil = new Sonam("Lover");
        Sonam shelatkar = new Sonam("Deliah");
        Sonam mithul = new Sonam("Laudya");
        Sonam siso = new Sonam("Bc");
        Sonam dalvi = new Sonam("Fake");
        shelatkar.setPriority(Thread.MAX_PRIORITY);
        dalvi.setPriority(Thread.MIN_PRIORITY);
        sahil.start();
        dalvi.start();
        siso.start();
        mithul.start();
        shelatkar.start();
        siso.getPriority();

    }
}
