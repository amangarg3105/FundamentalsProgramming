package doubts;


import java.util.Scanner;

public class Loops {



    public static void mostVotes() {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();


        sc.next().charAt(0);

        int [] arr = new int[size];

        System.out.println("Please enter values");

        for(int i = 0; i < size; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }






        //Assume
        int maxElement = arr[0];
        int maxIndex = 0;

        for(int i = 1; i < arr.length; i++) {

            int currentElement = arr[i];

            if(currentElement > maxElement) {
                maxElement = currentElement;
                maxIndex = i;
            }
        }

        System.out.println("Maximum Element is " + maxElement);
        System.out.println("Maximum Index is " + maxIndex);




    }
    public static void main(String[] args) {


        //for
        /*for(int i = 1; i < 100; i++) {
            System.out.println(i);
        }*/

        //print even numbers from 1 to 100
      /*  for(int i = 1; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }*/

       /* int i = 1;
        while(i <= 100) {
            System.out.println(i);
            i++; // i  =3
        }*/

       //mostVotes();





        int i = -1;
        //if i is greater than zero or ++i > 10
        //Short circuiting
        if(i > 0 && ++i > 10) {
            System.out.println(i);
        }

        System.out.println(i);



        boolean value = (i > 10) ? true : false;

        System.out.println(value);





    }
}
