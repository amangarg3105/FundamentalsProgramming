

//Report Card
public class ConditionalStatements {


    public static void main(String[] args) {

        int amount = 40;

        int playStationAmount = 50;

        int xBoxAmount = 36;


        int marks = 91;

        if (marks > 90 && marks <= 100) { //91 ... 100
            System.out.println("Excellent");
            if (amount >= playStationAmount)  // 40 is greater than 50
                System.out.println("Yay! I bought Playstation");
            else
                System.out.println("Oh No! I got the Xbox");
        } else if (marks > 70 && marks <= 90) {
            System.out.println("Average");
        } else {

        }


        /**
         * If(Cream is there) {
         * double price = 0.0;
         *   if(Flavour is choclate) {
         *       price = 100.0;
         *   } else if(flavous is vanilla) {
         *    price = 50.0;
         *  } else {
         *     price = 20.0;
         *  }
         *
         *  print that you are paying to shopkeeper
         * }
         */


        int day = 6;

        String dayString;

      /*  if(day == 1) {
            dayString = "Monday";
        } else if(day == 2) {
            dayString = "Tuesday";
        } else if(day == 3) {
            dayString = "Wednesday";
        } else {

        }*/


      String branch = "CSE";
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
                switch (branch) {
                    case "CSE" :

                }
            case 5:
                dayString = "Weekday";
                break;
            case 6:
            case 7:
                dayString = "Weekend";
                break;
            default:
                dayString = "Invalid Day";
        }

        System.out.println(dayString);

    }
}
