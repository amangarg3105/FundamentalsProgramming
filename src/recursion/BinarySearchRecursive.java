package recursion;

import java.util.Scanner;

/**
 * @author amgarg
 */
public class BinarySearchRecursive {


    public static int search(int[] arr, int start, int end, int key) {
        //calculate mid

        if(start > end) {
            return  -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == key) {
            return mid;
        }
        if(arr[mid] < key) {
            start = mid + 1;
            //right recursion
            int rightPartAns = search(arr, start, end, key);
            return rightPartAns;
        } else {
             end = mid - 1;
            int leftPartAns = search(arr, start, end, key);
            return leftPartAns;
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

        //Ask User which key you want us to search
        int key = sc.nextInt();

        int searchedIndex = BinarySearchRecursive.search(arr,
                0, arr.length - 1, key);

        System.out.println(searchedIndex);

    }
}
