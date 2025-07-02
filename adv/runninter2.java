package AdvJav.adv;

class CMPunk extends Thread{
    @Override
    public void run(){
        int i= 0;
        while (i<=50){
        System.out.println("Voice of the voiceless");
        i++;
    }
    }
}

class Edge extends Thread{
    @Override
    public void run(){
        int i= 0;
        while (i<=50){
            System.out.println("Spear");
            i++;
        }
    }
}

public class runninter2 {
    public static void main(String[] args) {
        CMPunk punk = new CMPunk();
        Thread voice = new Thread(punk);

        CMPunk edge = new CMPunk();
        Thread ves = new Thread(edge);

        Edge edgyh = new Edge();
        Thread bris = new Thread(edgyh);

        voice.start();
        ves.start();
        bris.start();




    }
}
