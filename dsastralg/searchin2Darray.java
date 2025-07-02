package dtastructndalgo.dsastralg;

import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,34,56},
                {33,5,78},
                {3,67,69}
        };
        int target = 3;
        //int[] ans = search(Arrays.toString(ans);
        System.out.println(search(arr,target));
    }
    static int[] search(int[][] arr, int target){
        int ans  = arr[0][0];
        for(int row = 0;row<arr.length;row++ ){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
