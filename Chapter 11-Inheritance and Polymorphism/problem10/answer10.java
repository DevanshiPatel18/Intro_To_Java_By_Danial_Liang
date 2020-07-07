package problem10;

import java.util.Scanner;

public class answer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.println("Enter a sentance:");
        String[] s = sc.nextLine().split(" ");

        for(int i =0; i < s.length; ++i)
            stack.push(s[i]);
        
        for(int i =0; i < s.length; ++i)
           System.out.print(stack.pop()+" ");
        sc.close();
    }
}