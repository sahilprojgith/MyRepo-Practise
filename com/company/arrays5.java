package com.company;

/*
Find the Largest Element in an Array
Find the Smallest Element in an Array
Calculate the Sum of All Elements in an Array
Calculate the Average of All Elements in an Array
Reverse an Array
Check if an Array Contains a Certain Value
Remove Duplicates from an Array
Find the Second Largest Element in an Array
Count the Occurrences of Each Element in an Array
Sort an Array in Ascending and Descending Order

 */

public class arrays5 {
    public static void main(String[] args) {
        int arr[] = { 2,34,56,1,33};
        int max = arr[0];

        for(int i = 0; i < arr.length;i++){
            if(arr[i]>max){ // just put arr[i]<min to check the minimum in the array.
                max = arr[i]; // if you change arr[i] = max ,the output will be 10 cause it only compares values with 10.
            }                 //
        }
        System.out.println("The largest element is " + max);



    }
}
/*
int[] arr= {19,4,56,10,3};
        int max = arr[0]; // 0 is 0th index which is 10

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){ // arr[i] updates itself from 0th index till last index and comparess > with max and determines the result.
                max = arr[i];
            }
        }
        System.out.println("The largest element in array is " + max);
 */
