
public class HelloWorld {

    public static void funtion1() {

    }

    public static void main(String[] args) {

        //Declartion
        short data;
        //Initialize
        data = 1902;

        int new_data = data;

        System.out.println(new_data);

        double pie = 3.14;

        long value = 1902;
        float new_value = value;


        int biggestValue = 214748364;

        short new_biggestValue = (short) biggestValue;

        System.out.println(new_biggestValue);


        int anotherValue = 30;
        double  new_AnotherValue = anotherValue;

        String characterSet = "Java";

        System.out.println(characterSet);


        float num1 = 20.14f;

        double num2 = num1;

        System.out.println(num2);


        int a=11, b=22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);



    }
}
