package AdvJav.adv;

public class finalllly {
    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
      finally {
        System.out.println("Cleaning up the Code ,so End of the program");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Undertaker (FINAL) " + b);
                b--;
            }
            try {
                System.out.println(40/10);
            }
            finally {
                System.out.println("Fiul");
            }
        }

    }
}
