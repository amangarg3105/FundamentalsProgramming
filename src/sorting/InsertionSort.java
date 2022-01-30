package sorting;

import java.util.Scanner;

/**
 * @author amgarg
 */
public class InsertionSort {


    /**
     * T.C - O(n^2)
     * S.C - O(1)
     * @param arr
     */
    public static void sort(int [] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int currentElement = arr[i];

            int hole = i;

            while(hole > 0 && currentElement < arr[hole - 1]) {
                arr[hole] = arr[hole - 1];
                hole = hole - 1;
            }
            arr[hole] = currentElement;

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
