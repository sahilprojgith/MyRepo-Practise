package dtastructndalgo.dsastralg;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 256;
        arr[2] = 123;
        arr[3] = 3;
        arr[4] = 423;
        //{2,256,123,3,423}
      //  System.out.println(arr[3]);

//        //input using for loops
//        for(int i =0 ;i < arr.length ;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));



//        for(int i =0 ;i < arr.length ;i++){
//            System.out.println(arr[i] + " ");
//        }



//        //enhanced for loops
//        for(int num: arr){ // for every element in array print array
//            System.out.println(num); // here num rep. element of an array.
//        }

        String[] arr3 = new String[3];
        for (int i = 0;i < arr3.length;i++){
            arr3[i] = sc.next() ;
        }
        arr3[1] = " Sahil";
        System.out.println(Arrays.toString(arr3));





    }
}


//        //store a roll no
//        int a = 89;
//        //store a name
//        String name = "Sahil More";
//
//        //Store 5 roll no.s
//        int[] rnos = new int[4];
//        //or directly
//       int[] rnos2 = {34,45,56,67,98};
//
//        String[] arr = new String[3];
//        System.out.println(arr[2]);
