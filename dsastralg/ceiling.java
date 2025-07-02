package dtastructndalgo.dsastralg;

public class ceiling{
    static int ceiling(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return start; // end for floor

    }



    public static void main(String [] args){
        int[] arr = {2,3,7,9,10,12,15,36,45,68};
        int target = 44;
        int ans = ceiling(arr,target);
        System.out.println(ans);


        }
        }


















/*
public class bs6 {
    public static void main(String[] args){
        int[] arr = {-19,-11,2,4,6,14,25,33,56,91,97};
        int target = 6;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){

            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
*/