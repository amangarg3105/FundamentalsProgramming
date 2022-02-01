package list;

import java.util.ArrayList;

/**
 * @author amgarg
 */
public class DynamicArray {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('a');

        list.add(4);
        list.add(5);
        list.add(6);

        list.set(0, 1);

        System.out.println(list.get(2));

        list.remove(1);

        System.out.println(list.get(1));
    }
}
