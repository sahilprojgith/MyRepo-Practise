package com.company;

public class Reversinganarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i<n; i++){
            temp = arr[i];
            arr[i] = arr [l-1-i];
            arr[l-1-i] = temp;
        }
        for ( int element: arr){
            System.out.println(element + " ");
        }

    }
}
