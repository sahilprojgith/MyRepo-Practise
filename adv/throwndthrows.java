package AdvJav.adv;

class NegativeException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be Negative";
    }
}

public class throwndthrows {
    public static double area(int r ) throws NegativeException{
        if (r < 0) {
            throw new NegativeException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b)throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
//            int c = divide(6,0);
//            System.out.println(c);
            double ar = area(5);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
            System.out.println(e);
        }

    }
}
