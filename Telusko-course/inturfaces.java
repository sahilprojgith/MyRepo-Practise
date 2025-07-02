interface Computer{
  void code();
}

class Laptop implements Computer{

  public void code(){
    System.out.println("let's code");
  }

}
class Dekstop implements Computer{

  public void code(){
    System.out.println("let's do coding"); 
  }

}
class Developer{

  public void devapp(Computer computer){//The Developer class has a method devApp(Laptop laptop), which takes a Laptop object as a 
                                    //  parameter and calls its code() method.
    computer.code();
  }

}

public class inturfaces {
  public static void main(String[] args) {
    Laptop laptop = new Laptop();
    Dekstop dekstop = new Dekstop();
    Developer developer = new Developer();
    developer.devapp(laptop);
    developer.devapp(dekstop);
    //Decoupling: The Developer class no longer depends on the concrete implementations 
    //(Laptop or Desktop) but only on the abstraction (Computer interface).
  }
}
