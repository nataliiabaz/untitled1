package day46_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // LIFO
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);

        System.out.println("At the top " + stack.peek()); // checks whats at the top of the stack
        stack.pop(); // removes the element at the top of the stack and returns it
        System.out.println("At the top now " + stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop() + " was removed from the stack");
        System.out.println(stack);

        // I can use the methods from List , but for stack I want to use the function of LIFO
        System.out.println(stack.get(0));
        stack.add("h");
        List<Integer> stack_1=new Stack<>();
        stack_1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(stack_1);
        ((Stack) stack_1).pop();
        System.out.println(stack_1);

;
    }
}
