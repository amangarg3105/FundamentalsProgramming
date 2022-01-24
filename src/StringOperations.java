
public class StringOperations {



    public static void stringPool() {


        String firstName = "Am an";
        String fullName = "Aman";


        int data = 10;
        double d = 10.0;

        String doubletring = String.valueOf(d);


        String datString = String.valueOf(10);
        System.out.println(datString);

       int length = fullName.length();
        System.out.println(length);

        System.out.println(firstName);
        System.out.println(fullName);
        //Incase of comparing the string
        //1. If you want to compare address use ==
        //2. If you want to compare the content of Strings the use equals
        if(firstName.equalsIgnoreCase(fullName)) {
            System.out.println("Equal");
        }

    }


    public static void main(String[] args) {

        stringPool();
    }
}
