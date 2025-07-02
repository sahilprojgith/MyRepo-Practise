package AdvJav.adv;
class Rudy extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class tt3 {
    public static double area(int r) throws Rudy{
        if (r<20){
            throw new ArithmeticException(" I am an Exception " );
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static void main(String[] args) {
        try {
            double piper = area(4);
            System.out.println(piper);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
