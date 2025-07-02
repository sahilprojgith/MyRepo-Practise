package AdvJav.adv;

interface HornCycle{
    void meth();

    // void cycle();
}

//class Sahilend implements HornCycle{
//    @Override
//    public void meth() {
//        System.out.println();
//    }
//}

//class Anandemo implements HornCycle{
//    @Override
//    public void meth() {
//        System.out.println("I am food");
//    }
//
//    @Override
//    public void cycle() {
//        System.out.println(" I am Bad");
//    }
//
//    public void display(){
//        System.out.println("Hello World");
//    }

public class lamdannonymous {
    public static void main(String[] args) {

//        Anandemo demo = new Anandemo();
//        demo.meth();

//        //Annonymous method
//        HornCycle demo = new HornCycle() {
//            @Override
//            public void meth() {
//                System.out.println("U");
//
//            }
//            @Override
//            public void cycle() {
//                System.out.println("T");
//
//            }
//        };
//        demo.meth();

        //Lambda Expressions:

//        HornCycle cyu = new Sahilend();
//        cyu.meth();

        HornCycle demo = ()-> System.out.println("I am Batman");
        demo.meth();
    }
}


