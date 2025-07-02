package dtastructndalgo.dsastralg;

public class binary4 {
    public static void main(String[] args) {
        int [] arr = {2,4,6,78,90,108};
        int target = 90;
        int ans = binarySearch4(arr,target);
        System.out.println(ans);
    }

    static int binarySearch4(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target>arr[mid]){
               start = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;

    }

}
