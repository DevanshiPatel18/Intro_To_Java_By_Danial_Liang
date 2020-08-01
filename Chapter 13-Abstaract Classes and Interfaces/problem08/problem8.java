package problem08;

public class problem8 {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyStack stack = new MyStack();
        for(int i =1; i <= 10; ++i)
            stack.push(i);

        MyStack stack2 = (MyStack)(stack.clone());

        for(int i =0;i < 3; ++i)
            stack2.pop();

        System.out.println("stack " + stack);
        System.out.println("stack copy " + stack2);

    }
}