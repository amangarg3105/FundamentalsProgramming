package searching;

import java.util.Scanner;

public class LinearSearch {

public static void search () {

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

    boolean isFound = false; //T.C - O(1)
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] == key) { // -- TC - O(1)
            System.out.println("Found at index " + i); //T.C - O(1)
            isFound = true; // T.C - O(1)
            break;  // T.C - O(1)
        }
    }

    if(isFound == false) {
        System.out.println("Not Found");
    }


}

    public static void main(String[] args) {

    LinearSearch.search();
    }
}
