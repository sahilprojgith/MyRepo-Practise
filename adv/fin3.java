package AdvJav.adv;

public class fin3 {
    public static int khalessi(){
        try {
            int a = 34;
            int b = 30;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(" Drago ");
        }
        finally {
            System.out.println("Games of Thrones");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = khalessi();
        System.out.println(k);
        int a = 40;
        int b = 10;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Done" + b);
                b--;
            }
        }
    }
}
