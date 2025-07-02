package AdvJav.adv;

class Cody extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
public class throwthrows2 {
    public static double area(int r) throws Cody {
        if(r<0){
            throw new Cody();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static void main(String[] args) {
        try {
            double ar = area(-34);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("The End");
        }

    }
}
