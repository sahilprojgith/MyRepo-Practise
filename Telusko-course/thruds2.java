
//we can run threads using anonymous classes through Runnable Interface as it is a FunctionalInterface
public class thruds2 {
  public static void main(String[] args) {
    
    Runnable obj1 = () -> 
    {
      for(int i = 0;i<=5;i++){
        System.out.println("hello");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
          e.printStackTrace();
       }

      }
    };

    Runnable obj2 = () -> 
    {
      for(int i = 0;i<=5;i++){
        System.out.println("hi");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    };

    Thread th = new Thread(obj1);
    Thread th2 = new Thread(obj2);


  }
  
}
