package dtastructndalgo.dsastralg;

public class Leetcode34 {

    public static void main(String[] args) {

    }

    public int[] SearchinRange(int[] numbers,int target){
        int[] ans = {-1,-1};
        int start = search(numbers,target,true);
        int end = search(numbers,target,false);

        ans[0]=start;
        ans[1]=end;


        return ans;
    }

    int search(int[] nums,int target, boolean findtheStartIndex){

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }else if (target>nums[mid]){
                start = mid + 1;
            }else{
                ans = mid; // dual Bs
                if(findtheStartIndex){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }


        }
        return ans;

    }


}
/*
 public int[] searchRange(int[] nums,int target){

        int[] ans = {-1,-1}; // initializes with -1,-1 to store first and last indices of Array.
        int start = search(nums, target,true); //helper method to find first occurence of target
        int end = search(nums,target,false); //helper method to find last occurence of target

        ans[0]=start; // helper method there, it searches in array suppose target 7 and then it findsit on index 3;
        ans[1]=end; // helper method there, it searches in array suppose target 7 and then it findsit on index 4;

        return ans; // return [3,4]
    }


    //this function just returns the index value of target
    int search(int[] nums,int target,boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1; // arr.length to nums.length

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex){ // boolean
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;

}

 */