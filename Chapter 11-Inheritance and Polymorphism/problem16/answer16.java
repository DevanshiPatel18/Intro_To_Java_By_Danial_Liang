package problem16;

import java.util.ArrayList;
import java.util.Scanner;

public class answer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            ArrayList<Integer> list = new ArrayList<>();
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            int answer = num1 + num2;

            int input;
            do{
            System.out.print("What is "+num1+" + "+num2+"?");
                input = sc.nextInt();
                if (input == answer)
                    break;
                if (list.contains(input))
                    System.out.println("You already answered "+input);
                else
                    {
                        System.out.print("Wrong Answer. Try Again.");
                        list.add(input);
                    }
                    
                }while(true);
                System.out.println("You got it !");
        }while(true);

    }
}