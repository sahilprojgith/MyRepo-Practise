package dtastructndalgo.dsastralg;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int [] numbers = {12,34,45,67};
        System.out.println(Arrays.toString(numbers));

        change(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
