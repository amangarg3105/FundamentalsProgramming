package doubts;


public class FirstNonRepeatingCharacter {

    public static void firstNonRepeatingCharacter()  {


        int [] arr = {1, 2, 1, 3, 1, 5, 1};

        String str = "";
        for(int i = 0; i < arr.length; i++) {

            //i = 1
            int currentElement = arr[i]; //2


            int j = 0;
            for(j =  i + 1; j < arr.length; j++) {

                //i = 4
                //j = 6
                //currentElement = 1
                //arr[j] = 1
                if(i != j && currentElement == arr[j]) {

                    //check if string contains 1
                    String currentElementString = String.valueOf(currentElement);
                    if(str.contains(currentElementString)) { //str = "12"
                        break;
                    }
                    str = str + currentElement; //"12"
                    System.out.println(currentElement);
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {


        firstNonRepeatingCharacter();
    }
}
