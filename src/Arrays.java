import java.util.Scanner;

public class Arrays {


    public static void arraysUsage() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please specify the size of array");
        int size = scanner.nextInt();

        int array[] = new int[size];

      /*  System.out.println("Please mention the data for " +  0 + " slot");
        int data = scanner.nextInt();
        array[0] = data;

        System.out.println("Please mention the data for " + 1 + " slot");
        int data1 = scanner.nextInt();
        array[1] = data1;
*/
      //Inserting values in array
        for(int i = 0; i < size; i++) {//1 < 5
            System.out.println("Please mention the data for " +  i + " slot");
            int data = scanner.nextInt();
            array[i] = data;
        }

        System.out.println("Printing array values");


        for(int i = 0; i  < size; i++) {
            System.out.println(array[i]);
        }
        /*//Indexing loop
        */

        for(int i : array ){
            System.out.println(i);
        }

        String [] strArray = new String[5];

        strArray[1] = "data";
        strArray[1]=  strArray[1].concat("string");

/*
        int [][] twoDArray = new int[5][5];
        twoDArray[1][2]*/







    }

    public static void main(String[] args) {

        arraysUsage();
    }
}
