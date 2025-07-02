package com.company;

public class MethodsOverloading {
    static void four(){             // You can write anything in place of four
        System.out.println("Good Morning bro!");        //Method overloading
    }
    static void four(int a){
        System.out.println("Good Morning bro!" + a + " bro");     //Method overloading
    }
    static void four(int a, int b){       // static int wont work here, you cannot define it two times
        System.out.println("Good Morning bro!" + a + " bro");
        System.out.println("Good Morning bro!" + b + " bro");        //Method overloading
    }

    static void change(int a){  // Paranthesis are important {} or it won;t work just on ;
        a = 89;                 // changing the integer

    }
    static void change2(int [] arr){  // Paranthesis are important {} or it won;t work just on ;
        arr[0] = 13;                  // Changing the array

    }
    static void tellJoke(){
        System.out.println("I invented a new Joke\n" + "Plagarism");
    }

    public static void main(String[] args) {
        //tellJoke();
       // int[] marks = {12, 53 , 89, 79, 88, 73};
        // Changing the integer ; it didn't change.
        //int x = 12;
        //change(x);
        //System.out.println("X after running change is " + x);

        //Changing the array: It did change
       // change2(marks);
       // System.out.println("X after running change is " + marks[0]);

        //Method Overloading
        four();
        four(3000);  // just write 3000 and not  a or it ll show error {input = Integer}
        four(3000,4000);  //Arguments are actual Values
    }
}
