package dtastructndalgo.dsastralg;

public class maxRangeinArr {
    public static void main(String[] args) {
        int[] arr2= {1,3 ,4,6,7};
        System.out.println(maxRange(arr2, 1 ,4));
    }
    static int maxRange(int[] arr,int Start, int End){
        int maxVal = arr[0];
        for(int i = Start; i< End; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
