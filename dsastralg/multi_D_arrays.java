package dtastructndalgo.dsastralg;

import java.util.Arrays;
import java.util.Scanner;

public class multi_D_arrays {
    public static void main(String[] args) {
      /*
        1 2 3
        4 5 6
        7 8 9
       */
        Scanner sc = new Scanner(System.in);
 //       int[][] arr  = new int[3][];

//        int[][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5},   //1st index
//                {6, 7, 8, 9}  // 2nd index - arr2D[2][0] = 6 / arr2D[2][4] = 9
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        // input
        for(int row= 0; row < arr.length;row++){
            //for each colum in every loop.
           for (int col = 0; col< arr.length;col++){
               arr[row][col] = sc.nextInt();
           }
        }

        // output
//        for(int row= 0; row < arr.length;row++){
//            //for each colum in every loop.
//            for (int col = 0; col< arr.length;col++){
//                System.out.println(arr[row][col] + " ");
//            }
//        }

//        for(int row= 0; row < arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
