package dtastructndalgo.dsastralg;

public class Sortarr {

    static void bubblesort(int [] arr){
        int n = arr.length;

        // Traverse through all elements in the array
        for(int i = 0; i<n-1;i++){
            // Last i elements are already in the correct place
            for(int j = 0;j<n-i-1;j++){
                // Swap if the element found is greater than the next element
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr){
        for(int i :arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {5,1,4,3,8};

        System.out.print("Original Array : ");
        printArray(arr);

        bubblesort(arr);

        System.out.print("Sorted Array : ");
        printArray(arr);

    }
}
