package sorting;


import java.util.Scanner;

public class MergeSort {

    /**
     * T.C - O(n log n)
     * S.C - O(n)
     * @param arr
     */
    public static void sort(int [] arr) {


        if(arr.length == 1) {
            return;
        }
        int mid = arr.length /2;

        int n = arr.length;

        int [] left = new int[mid];

        int right[] = new int[n - mid];

        //fill left array
        for(int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for(int i = 0; i < right.length; i++) {
            right[i] = arr[i + mid]; // right[0] = arr[ 0 + 3] //right[1] = arr[ 1 + 3]
        }
        sort(left);
        sort(right);

        merge(left, right, arr); // T.C - O(n)

    }

    private static void merge(int[] left, int[] right, int[] arr) {


        int l = 0;
        int r = 0;
        int k = 0;


        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[k] = left[l];
                k++;
                l++;
            } else {
                arr[k] = right[r];
                r++;
                k++;
            }
        }


        while(l < left.length) {
            arr[k] = left[l];
            k++;
            l++;
        }

        while(r < right.length) {
            arr[k] = right[r];
            r++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the array Size");

        int size = sc.nextInt();

        int[] arr = new int[size];

        //Ask user what to fill at that index
        for (int index = 0; index < arr.length; index++) {
            System.out.println("Please enter the value for index " + index);
            int element = sc.nextInt();
            arr[index] = element;
        }

        sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
