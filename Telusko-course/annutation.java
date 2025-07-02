class Sat{
  public void bus(){
    System.out.println("Sit down");
  }
}

class Bat extends Sat{
  @Override  //meta data
  public void bus(){
    System.out.println("Sit down");
  }
}

public class annutation {
  public static void main(String[] args) {
    Bat bat = new Bat();
    bat.bus();
    
  }
}
