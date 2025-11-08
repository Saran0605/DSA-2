package Problems;

import java.util.Stack;

public class ImplementQUsingSt {
    private Stack<Integer> first ;
    private Stack<Integer> second;

    public ImplementQUsingSt(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item){
        first.push(item);
    }

    public int pop() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public boolean empty(){
        return first.isEmpty();
    }

    public int peek() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }


}
