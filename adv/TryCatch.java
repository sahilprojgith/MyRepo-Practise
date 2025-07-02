package AdvJav.adv;

public class TryCatch {
    public static void main(String[] args) {
        int a = 900;
        int b =0;
        try {
            int c = a/b;
            System.out.println("The values are : "+ c);
        }
        catch (Exception r){
            System.out.println("We cant run the cod because:");
            System.out.println(r);
        }

    }
}
/*
        int a =6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result is :" + c);
        }
        catch(Exception e){
            System.out.println("We failed to divide, Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the Program");
*/