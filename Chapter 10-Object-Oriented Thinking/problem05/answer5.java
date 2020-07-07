package problem5;
import java.util.Scanner;

public class answer5 {
    public static void main(String[] args) {
        StackOfIntegers myStack = new StackOfIntegers();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number :");
        int num = sc.nextInt();

        int i =2;
        while (num != 1){
            if ( num % i == 0){
                myStack.push(i);
                num /=i;
            }
            else
                ++i;
        }

        while((!myStack.empty())){
            try{
            System.out.print(myStack.peep()+",");
             myStack.pop();
            }
            catch(Exception e){

            }
        }
        sc.close();


    }
}