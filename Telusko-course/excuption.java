public class excuption {
  public static void main(String[] args) {
    int i = 20;
    int j = 0;

    try {
        j = 18/i;
        if(j==0){
          throw  new ArithmeticException("I don't want to print zero");
        }
        System.out.println("That is the default output ");
    } 
    catch (ArithmeticException e) 
    {
      j=18/1;
      System.out.println("Something went wrong");
    }
    catch (Exception e){
      System.out.println("");
    }


  }
}
