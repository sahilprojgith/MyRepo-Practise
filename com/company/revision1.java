package com.company;

class Quuen{
    int a2;
    int d3;
    String name;
    public void showResults(){
        System.out.println("My name is "+ a2);
        System.out.println("My name is " + d3);
        System.out.println("My name is "+name);

    }
}

public class revision1 {
    public static void main(String[] args) {
        Quuen quuen = new Quuen();
        quuen.a2=23;
        quuen.name="chika chika slim shady";
        quuen.showResults();
    }



}



//1
//        String name = new String("Sahil");
//        System.out.println(name);

//2
//        for(int i = 0;i<=5;i++){
//           // System.out.println(i);
//            System.out.println("I am back");
//            if(i==2){
//                System.out.println("End of loop");
//                //break;
//                continue;
//            }
//        }

//        for(int i =0;i<=5;i++){
//            System.out.println("Big 3");
//            if(i==2){
//                System.out.println("There's no Big 3 only Big Me");
//                continue;
//            }
//        }

//        int n = 5;
//        for(int j = 0;j<=n;j++){
//            for(int i =0;i<=j;i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//    static void wee(){
//        System.out.println("First line");
//    }
//
//    static void wee(int a){
//        System.out.println("this consists lots of "+ a +" more lines");
//    }
//
//    public static void main(String[] args) {
//        wee();
//        wee(34);
//    }

//    static int sum(int ...arr){
//        int result = 0;
//        for(int a :arr){
//            result+=a;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        System.out.println("This is " + sum(2,3));
//
//    }

//static int tofee(int ...arr) {
//    int tofee = 1;
//    for(int a :arr){
//        tofee+=a;
//    }
//    return tofee;
//}
//
//    public static void main(String[] args) {
//        System.out.println("there ae these many toffies " + tofee(7,8,9,5));
//    }