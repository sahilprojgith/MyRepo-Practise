package dtastructndalgo.dsastralg;

public class selectionsort {

    static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){

            int minIndex = i; // assumed minimum index is i = first element i n unsorted array.

            for(int j = i+1;j<n;j++){

                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }



    public static void main(String[] args) {
        int[] arr = {5,4,9,33,12};

        System.out.println("Unsorted elements are : ");
        printArray(arr);

        selectionsort(arr);

        System.out.println("Sorted elements are :");

        printArray(arr); // printing ka method yahi hai. print nhi hoga iske bina .


    }
}
