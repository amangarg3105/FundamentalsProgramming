package recursion;


import java.util.Scanner;

public class MaximumElement {


    public static int maxElement(int [] arr, int index) {

        if(index == arr.length - 1) {
            int lastElement = arr[arr.length - 1];
            return lastElement;
        }
        int max = arr[index];

        int smallerAnsProblem =
                maxElement(arr, index + 1);

        if(smallerAnsProblem > max) {
            max = smallerAnsProblem;
        }
        return max;

    }


    public static void stackOverflow() {
        stackOverflow();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);/*
        System.out.println("Please input the array Size");

        int size = sc.nextInt();

        int [] arr = new int[size];

        //Ask user what to fill at that index
        for(int index = 0; index < arr.length; index++) {
            System.out.println("Please enter the value for index " + index);
            int element = sc.nextInt();
            arr[index] = element;
        }


        int maxElement = maxElement(arr, 0);
        System.out.println(maxElement);*/

        stackOverflow();
    }
}
