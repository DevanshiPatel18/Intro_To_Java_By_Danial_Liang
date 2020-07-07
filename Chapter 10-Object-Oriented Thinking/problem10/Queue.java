package problem10;

public class Queue {
    private int[] elements;
    private int size=-1;

    public Queue(){
        this(8);
    }

    public Queue(int num){
        elements = new int[num];
    }

    public void enqueue(int v){
       
        if (size >= elements.length-1){
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        size++;
        elements[size] = v;
    }

    public int dequeue(){
        int v = elements[0];
        for(int i =0 ;i <= size-1; ++i){
            elements[i] = elements[i+1];
        }
        return v;
    }

    public boolean empty(){
        return size == -1 ? true : false;
    }

    public int getSize(){
        return size+1;
    }
}