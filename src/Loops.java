
public class Loops {


    int i = 0;


    //Method
     public static boolean displayOddNumber(int number, int number2, int number3) { //number =3

         if(number % 2 != 0) {
             return true;
         }
         System.out.println("Printing from function");
         return false;
    }

    public static void funcName() {

    }


    public static void main(String[] args) {

        int data = 10;
        System.out.println(data);

displayOddNumber(0, 1, 2);
        int number = 0;
       /* for(i = 0; i < 1;) {
      int
            //Initialize
            // Condition
            //Updation
            System.out.println("Walking");
        }*/

      /*  for (number = 0; number < 50000; number++) {


        }

        number = 0;

        while(number < 50000) {
            //even number
            if(number % 2 == 0) {
                System.out.println("Even number is " + number);
            } else {
                System.out.println("Odd number is " + number);
            }

           // number = number + 1;
        }
        */
        number = 10;


        do {
            System.out.println(number);
            number--;
        } while (number >= 0); //6 >= 0


        boolean keepRunning = false;
        while (keepRunning = true) { // while(true)
            System.out.println("Running");
            if(keepRunning) {
                break;
            }
        }

      /* do {

           int variable = 0;
           System.out.println(variable);
       } while (keepRunning); // while(false)
*/

      for(number = 0 ; number < 100; number++) {
          System.out.println(data);
          boolean isDivisible = number % 3 == 0;
          if(isDivisible) {
              System.out.println("It is divisible");
          }
      }

      /*for(int i = 1; i < 100; i++) {

          for(int j = 1; j < 100; j++) {
              System.out.println("Walking");
              break;
          }

          //OuterLoop Statement
     }*/



      for(int i = 0; i < 10; i++) {
          if (i == 5) {
              continue;
      }
        System.out.println(i);
      }






    }
}
