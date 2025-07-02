package dtastructndalgo.dsastralg;

public class mimmumnumberlinear {
    public static void main(String[] args) {
        int[] arr = {13,4,565,3543,34};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];  //0th index
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<ans){
                ans= arr[i];
            }
        }
        return ans;
    }
}
