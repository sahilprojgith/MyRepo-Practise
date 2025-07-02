package AdvJav.adv;

class Ash extends Exception{
    @Override
    public String getMessage() {
        return "Radius cannot be negetive";
    }

    @Override
    public String toString() {
        return "Radius cannot be negetive";
    }
}

public class throwandthrowspractise {
    public static  double area(int f) throws Ash{
        if(f<0){
            System.out.println("Exception");
        }
        double ar = Math.PI*f*f;
        System.out.println(ar);
        return ar;
    }
    public static double divide(int a, int b){
        double ar = a/b;
        return ar;
    }


    public static void main(String[] args) {
        try{
            double ar = area(5);
        }
        catch (Exception e ){
            System.out.println(e);
        }
    }
}
