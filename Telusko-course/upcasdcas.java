class Anda{

  public void show(){
    System.out.println("Show A");
  }

}

class Omlette extends Anda{
  public void show1(){
    System.out.println("Show B");
  }
}


public class upcasdcas {

  public static void main(String[] args) {

    Anda anda = (Anda)new Omlette();   // Anda ha no clue Omlette exits  //Upcasting //Anda is implicit
    anda.show();

    Omlette omlette = (Omlette) anda;  // Downcasting
    omlette.show1();
    
  }
}
