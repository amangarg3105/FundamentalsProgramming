package sorting;

import java.util.Scanner;

/**
 * @author amgarg
 */
public class SelectionSort {

    public static void sort(int [] arr) {

        int n = arr.length;

        for(int i = 0; i < arr.length; i++) {
            int min = i;

            for(int j = i + 1; j < n; j++) {

                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int currentElement = arr[i];
            int minimum = arr[min];

            //swap
            int temp = arr[i];
            arr[i] = minimum;
            arr[min] = temp;
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
