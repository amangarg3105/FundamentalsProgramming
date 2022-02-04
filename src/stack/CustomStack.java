package stack;

import java.util.ArrayList;

public class CustomStack {


    ArrayList<Integer> list;
    private int top;

    public CustomStack() {
        list = new ArrayList<>();
        top = -1;
    }


    public void push(int value) {
        list.add(value);
        top++;
    }

    public void pop() {
        int lastElementIndex = list.size() - 1;
        list.remove(lastElementIndex);
        top--;

    }

    public int peek() {
        return list.get(top);
    }
}
