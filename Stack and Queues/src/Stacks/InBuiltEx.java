package Stacks;

import java.util.Stack;

public class InBuiltEx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        //pop() will return the integer which is removed
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.empty());





    }
}
