package searching;


import java.util.Scanner;

public class BinarySearch {


    public static void binarySearch() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the array Size");

        int size = sc.nextInt();

        int [] arr = new int[size];

        //Ask user what to fill at that index
        for(int index = 0; index < arr.length; index++) {
            System.out.println("Please enter the value for index " + index);
            int element = sc.nextInt();
            arr[index] = element;
        }


        System.out.println("Hi, Please enter the element you want to search");
        int key = sc.nextInt();


        int start = 0;

        int end = arr.length - 1;

        boolean isFound = false;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                isFound = true;
                System.out.println("Found it " + mid);
                break;
            }

            if(arr[mid] < key) {
                start = mid + 1;
            }

            if(arr[mid] > key) {
                end = mid - 1;
            }
        }


        if(isFound == false) {
            System.out.println("Element Not found ");
        }







    }

    public static void main(String[] args) {
        BinarySearch.binarySearch();
    }
}
