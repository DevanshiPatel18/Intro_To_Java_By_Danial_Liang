package problem08;

import java.util.ArrayList;

public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(list.size() - 1);
    }

    public Object pop(){
        return list.remove(list.size() - 1);
    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        MyStack copy = (MyStack)(super.clone());
        copy.list = (ArrayList<Object>)(list.clone());
        return copy;
    }
    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}