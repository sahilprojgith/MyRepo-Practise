package AdvJav.adv;

public class fin2 {
    public static int albert() {
        try {
            int a = 34;
            int b = 10;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("I am Kane");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = albert();
        System.out.println(k);
        int a = 4;
        int b = 8;
        while(true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("Kane mama has come at number " + b);
                b--;
            }
        }
        try {
            System.out.println(40 / 10);
        }
        finally {
            System.out.println("Feud");
        }

    }

}
