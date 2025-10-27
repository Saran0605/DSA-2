package Stacks;

public class CustomStack {
    protected int[] data;
    //default size of all stack created will be 10
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;


    public CustomStack(){
        //if no size provides the default size the constructor will be called
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannon pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        // return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannon peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }


}
