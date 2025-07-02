class A implements Runnable{ // instead of extending Thread - implement runnable

public void run(){  //run() method needs to be there in Thread class.
  for (int i =0;i<=20;i++){
    System.out.println("hello");
    try{
    Thread.sleep(1000); //sleep and catch that exception as it might throw an exception.
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
}

class B implements Runnable{
  public void run(){
    for(int i = 0;i<=20;i++){
    System.out.println("Hi");
    try{
    Thread.sleep(1000); //sleep and catch that exception as it might throw an exception.
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  }
  }

public class thruuds {
  public static void main(String[] args) {
    Runnable obj1 = new A(); //reference of a interface and objevct of a class.
    Runnable obj2 = new B();


    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();



    //if you have a Runnable class start() will not work directly

    //obj2.setPriority(Thread.MAX_PRIORITY);

    //obj1.start();  //have to use start to run a Thread
    // try{
    // Thread.sleep(1000); //sleep and catch that exception as it might throw an exception.
    // }catch(Exception e){
    //   e.printStackTrace();
    // }
  

    // obj2.start();try{
    // Thread.sleep(1000); //sleep and catch that exception as it might throw an exception.
    // }catch(Exception e){
    //   e.printStackTrace();
    // }
  

  }
}
