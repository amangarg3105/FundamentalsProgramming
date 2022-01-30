package sorting;

import java.util.Scanner;

/**
 * @author amgarg
 */
public class BubbleSort {

    public static void sort(int [] arr) {


        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {

                int firstElement = arr[j]; //T.c
                int secondAdjacentElement = arr[j + 1];

                if(firstElement > secondAdjacentElement) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
