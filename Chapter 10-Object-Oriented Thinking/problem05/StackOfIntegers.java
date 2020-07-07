package problem5;


public class StackOfIntegers {
    private int[] stack;
    private static final int DEFAULT_SIZE = 16;
    private int size =-1;

    public StackOfIntegers(){
        this(DEFAULT_SIZE);
    }

    public StackOfIntegers(int length){
        stack = new int[length];
    }

    public void push(int n){
        if (size >= stack.length-1){
            int[] temp = new int[stack.length*2];
            System.arraycopy(stack,0,temp,0,stack.length);
            stack = temp;
        }
        ++size;
        stack[size] = n;
    }

    public int pop(){
        return stack[--size];
    }
    public int peep(){
        return stack[size];
    }

    public boolean empty(){
        return size < 0;
    }

    public int getSize(){
        return size +1;
    }
   
}