package recursion;

import java.util.Scanner;

public class LinearSearchRecursive {


    public static int search(int[] arr, int index, int key) {

        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        int searchedIndex =
                search(arr, index + 1, key);

        return searchedIndex;
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

        //Ask User which key you want us to search
        int key = sc.nextInt();

        int searchedIndex = LinearSearchRecursive.search(arr, 0, key);
        System.out.println(searchedIndex);
    }



}
