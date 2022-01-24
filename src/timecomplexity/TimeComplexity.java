package timecomplexity;


import java.util.Scanner;

public class TimeComplexity {

    public static void main(String[] args) {

        int a = 10;//declaring and initialization

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
/*
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }


        for (int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }

        for (int i = n; i >= 1; i = i / 2) {
            System.out.println(i);
        }


        for (int i = 0; i * i < n; i++) {
            System.out.println(i);
        }


        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.println(i);
            }
        }*/

//        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(j);
                break;
            }

        System.out.println("Outside the loop");
//        }


        for(int i = 0; i < n; i++) {
            for(int j = 100; j < n; j++) {
                for(int k = 1000; k < n; k++) {
                    System.out.println(k); // -- T.C O(1)
                }
            }
        }

        for(int i = 0; i < n; i++) { // tc - O(n)
            for(int j = 0; j < n; j++) { //tc. O(n)
                if(i % 2 == 0) { // t.c - O(1)
                    System.out.println(i); // tc -O(1)
                }
            }
        }


       /* int i = 1;
        while (i < n) { //TC. O(n)
            System.out.println(i);// T.C O(1)
            for(int j = 0; j < n; j++) { // T.C O(n)
                System.out.println(j);
            }
            i++;
        }*/



        int arr[]  = new int[n];  //T.C - O(1)

        arr[0] = 5; //T.C - O(1)
        arr[1] = 8;//T.C - O(1)
        arr[2] = 10;//T.C - O(1)
        arr[3] = 15;//T.C - O(1)
        arr[4] = 20;//T.C - O(1)


        for(int start = 0; start < arr.length; start++) {
            System.out.println(arr[start]); //TC O(1)
        }


        System.out.println(arr);


        int [][] _2darr = new int[5][5];

        _2darr[0][1] = 8;
        System.out.println();






     }
}
