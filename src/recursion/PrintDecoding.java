package recursion;


public class PrintDecoding {

    public static void printAllDecoding(String number, String output) {

        if(number.length() == 0) {
            System.out.println(output);
            return;
        }

        Character firstCharacter = number.charAt(0);

        char character = (char) ('a'  + firstCharacter - 0);

        printAllDecoding(number.substring(1), output+ character);

        if(number.length() <= 1) {
            return;
        }
        String firstTwoCharacters = number.substring(0, 2);

        int firstTwoCharacter = Integer.parseInt(firstTwoCharacters);

        char firstTwoCharacterValue = (char) ('a'  + firstTwoCharacter - 0);

        printAllDecoding(number.substring(2), output + firstTwoCharacterValue);
    }


    public static void main(String[] args) {
        String number = "123";

        printAllDecoding(number, "");
    }
}
