package problem17;

import java.util.ArrayList;
import java.util.Scanner;

public class answer17 {
    public static int getN(int m) {
        ArrayList<Integer> list = new ArrayList<>();

        //get factors
        int i = 2;
        do{
            if ( m % i == 0){
                list.add(i);
                m /= i;
            }
            else{
                ++i;
            }
        }while(m != 1);
        System.out.println(list);
        int product = 1;
        int element = list.remove(0);
        int count =1;
        do{
            int num = list.remove(0);
            if (num == element)
                count++;
            else{
                if ( count % 2 !=0){
                    product = product * element; 
                }
                element = num;
                count = 1;
            }
            //System.out.println("num: "+num+" product: "+product+" element: "+element+"count :"+count  );
        }while(!list.isEmpty());
        if (count %2 != 0){
            product = product * element;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer m:");
        int m = sc.nextInt();
        int n = getN(m);
        System.out.println("The smallest number n for m*n to be a perfect square is: "+n+ " m*n is "+(m*n));
        
        sc.close();
    }
}