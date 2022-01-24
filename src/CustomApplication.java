import java.util.Scanner;

public class CustomApplication {


    public static int add(int a, int b) {
        int result = a + b; //999999999999999 + /99999999999
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void calculator() {

        System.out.println("Hi, You are using calculator");

        System.out.println("Please provide two numbers to perform mathematical operation");

        System.out.println("Please provide firstNumber");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        if (firstNumber > 999999) {
            System.out.println("This number is not supported currently");
            return;
        }
        System.out.println("Please provide secondNumber");

        int secondNumber = scanner.nextInt();
        if (secondNumber > 999999) {
            System.out.println("This number is not supported currently");
            return;
        }

        System.out.println("Please choose the below operation to perform");

        System.out.println("Type 1 for Addition");
        System.out.println("Type 2 for Multiplication");

        int choice = scanner.nextInt();

        int result;
        switch (choice) {
            case 1:
                //performAddition
                result = add(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case 2:
                //perform Multiplication
                result = multiply(firstNumber, secondNumber);
                System.out.println(result);
                break;

            default:
                System.out.println("Hey choose valid option fool");
                break;

        }
    }

    public static double reportCard() {

        System.out.println("Hi, You are using report card");

        System.out.println("How many subjects are there for student");

        Scanner sc = new Scanner(System.in);
        int subjectCount = sc.nextInt();

        int[] subjectMarks = new int[subjectCount];

        for (int i = 0; i < subjectCount; i++) {//1 < 5
            System.out.println("Please type the marks for " + i + " subject out of 100");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Please provide valid marks");
                return 0.0;
            }
            subjectMarks[i] = marks;
        }


        double totalMarksScored = 0;

        for (int i = 0; i < subjectCount; i++) {
            //asking marks for current slot
            int currentMarks = subjectMarks[i];
            totalMarksScored = totalMarksScored + currentMarks; //30 + 95
        }

        System.out.println("Marks Obtained " + totalMarksScored);

        //int / int
        double percentage = (totalMarksScored / (subjectCount * 100)) * 100;

        System.out.println("Percentage is " + percentage);
        return percentage;

    }

    public static void trapizeiumPattern() {
        System.out.println("Please mention the number of lines you want to print");

        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();


        int count1 = 0;
        int count2 = 0;
        for(int i = numberOfLines; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {
                System.out.print(++count1 + "* ");
            }

            for(int k = 1; k <= i; k++) {
                System.out.print(++count2 + (i * i));

                if(k != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void printRightTriangleStarPattern() {
        System.out.println("Please mention the number of lines you want to print");

        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        //Responsible to print lines
        for (int i = 1; i <= numberOfLines; i++) { //i =1<=9

            //Responsible to print stars in that line
            for (int j = 1; j <= i; j++) { //2 <=2
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void printPatterns() {
        System.out.println("Hi, You are about to print patterns");

        System.out.println("Please type pattern choice you want to print");

        System.out.println("Type 1. for Right Triangle star pattern");

        System.out.println("Type 2. for Right Triangle Numbered pattern");

        System.out.println("Type 3. for Trapizeium pattern");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                //Right Triangle star pattern
                printRightTriangleStarPattern();
                break;
            case 2:
                //Right Triangle Numbered pattern
                trapizeiumPattern();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    /**
     * This method is responsible to take input from user
     */
    public static void takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choice one of the below options");
        System.out.println("Type 1. for Calculator");
        System.out.println("Type 2. for ReportCard");
        System.out.println("Type 3. for Patterns");


        int option = scanner.nextInt();

        switch (option) {
            case 1:
                //use calculator
                calculator();
                System.out.println("Using calculator");
                break;
            case 2:
                //use report card
                double percentage = reportCard();
                System.out.println(percentage);
                break;
            case 3:
                //use pattern
                printPatterns();
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    public static void main(String[] args) {

        takeInput();
    }
}
