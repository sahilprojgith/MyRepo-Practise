package dtastructndalgo.dsastralg;

public class searchinRange {
    public static void main(String[] args) {
        int [] arr ={18,9,8,-7,90,8};
        int target = 8;
        System.out.println(linearSearch(arr,target,1,4));

    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start ; index<=end;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
