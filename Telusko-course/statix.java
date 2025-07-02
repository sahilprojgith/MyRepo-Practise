
class Mobile{
  String brand;
  int price;
  static String name;

  public void show(){  // this is not a static method , this is a instance method
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(Mobile obj){
    System.out.println(obj.brand + " : " + obj.price + " : " + name); // cannot use non static in static -
                                                                      //brand and price are instance variables.
  } // so we use obj.brand 

}


public class statix {
  public static void main(String[] args) {

    Mobile obj1 = new Mobile();
    obj1.brand="Apple";
    obj1.price=150000;
    Mobile.name = "SmartPhone";

    

    // Mobile obj2 = new Mobile();
    // obj1.brand="Vivo";
    // obj1.price=110000;
    // Mobile.name = "SmartPhone";

    // obj1.show();
    // obj2.show();

    // // Mobile.show(); // cannot call a non static method with the help of class name, that's why you need class name

    // Mobile.show1(obj1);

  }
}
