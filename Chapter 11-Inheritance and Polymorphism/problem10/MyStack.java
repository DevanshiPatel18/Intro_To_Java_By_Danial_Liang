package problem10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object>{
    
    public int getSize(){
        return size();
    }

    public Object peep(){
        return get(size() - 1);
    }

    public void push(Object i){
        add(i);
    }

    public Object pop(){
        return remove(size() - 1);
    }

    @Override
    public String toString(){
        return "stack "+ toString();
    }
}