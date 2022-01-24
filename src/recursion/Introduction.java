package recursion;


public class Introduction {



    public static int factorial(int number) {

        int smallAns = factorial(number - 1);

        int bigProblemAns = smallAns * number;

        return bigProblemAns;
    }

    public static void main(String[] args) {

        int ans = factorial(5);
        System.out.println(ans);
    }
}
