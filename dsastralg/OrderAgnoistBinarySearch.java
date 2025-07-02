package dtastructndalgo.dsastralg;

public class OrderAgnoistBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-11,-5,2,3,4,15,16,17,18,22,45,89};
        int target = 22;
        int ans = orderagnoistBS(arr, target);
        System.out.println(ans);
    }
    static int orderagnoistBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //Find wheather the array is ascending or descending,
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        while(start <= end){

            // find the middle element
            // int mid = start + end/2; // Might be possible that (start + end)/2
            //might exceed the range of integers.

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
