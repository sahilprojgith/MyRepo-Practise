package dtastructndalgo.dsastralg;

public class InfiniteArray {
    public static void main(String[] args) {


    }
    static int FindingRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        //condition for target
        while(target>arr[end]){
            int temp = end + 1;

            end = end + (end - start + 1)*2;
            start = temp;
        }
        return (binarySearch(arr,target,start,end));

    }
    static int binarySearch(int arr[],int target,int start,int end){


        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1 ;
            }else {
                return mid ;
            }

        }
        return -1;
    }
}
