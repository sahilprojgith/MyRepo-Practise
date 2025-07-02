package dtastructndalgo.dsastralg;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,34,16,-90};
        int target = 23;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    // Search in the Array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){  // Why not arr.lenght() - cause its is a variable.
            return -1;
        }
        for(int index = 0;index<arr.length;index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }


        return -1;
    }
}
