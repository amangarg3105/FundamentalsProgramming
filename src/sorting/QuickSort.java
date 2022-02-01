package sorting;


public class QuickSort {



    public static void sort(int [] arr, int start, int end) {

        if(start >= end) {
            return;
        }

        int pivotIndex =  findPivot(arr, start, end);
        sort(arr, start, pivotIndex - 1);
        sort(arr, pivotIndex + 1, end);
    }


    public static int findPivot(int []arr, int start, int end) { // end = n- 1

        int pivot = arr[end];
        int pivotIndex = start;

        for(int index =  start; index < end; index++ ) {
            if(arr[index] <= pivot) {
                //swap
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[index];
                arr[index] = temp;
                pivotIndex = pivotIndex + 1;
            }
        }

        //Swap pivotIndex and pivot
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;

        return pivotIndex;
    }


    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 1, 3, 6};

        sort(arr, 0, arr.length - 1);



        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
