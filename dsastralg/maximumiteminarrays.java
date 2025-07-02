package dtastructndalgo.dsastralg;

public class maximumiteminarrays {
    public static void main(String[] args) {
        int[] arr2= {1,3 ,45,6,7};
        System.out.println(max(arr2));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
       for(int i = 0; i< arr.length; i++){
           if(arr[i] > maxVal){
               maxVal = arr[i];
           }
       }
        return maxVal;
    }
}
