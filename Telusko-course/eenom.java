enum Laptop{

  Dell(1000), HP(2000), MacBook(3000), ASUS(500); 
  //constructors that passes the values


  private int price; // to access the private variable use getters and setters

  private Laptop(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


}


public class eenom {
  public static void main(String[] args) {
    for(Laptop lap: Laptop.values()){
      System.out.println(lap + " : " + lap.getPrice());
    }
  }
}
