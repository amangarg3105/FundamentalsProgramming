package stack;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUse {


    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        CustomStack customStack = new CustomStack();

        customStack.push(6);
        customStack.push(1);
        customStack.push(3);
      //  System.out.println(customStack.peek());


        customStack.pop();

     //   System.out.println(customStack.peek());


     /*   stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(1);

        System.out.println(stack.peek());


        stack.pop();

        System.out.println(stack.peek());*/

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

       // System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue.peek());

    }
}
