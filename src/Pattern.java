
public class Pattern {


    public static void main(String[] args) {

        int numberOfLines = 9 ;

        //Responsible to print lines
        for(int i = 1; i <=numberOfLines; i++) { //i =1<=9

            //Responsible to print stars in that line
            for(int j = 1; j <= i; j++) { //2 <=2
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
