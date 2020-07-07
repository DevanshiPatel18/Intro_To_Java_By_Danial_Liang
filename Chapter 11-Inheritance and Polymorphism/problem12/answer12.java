package problem12;

import java.util.ArrayList;
import java.util.Scanner;

public class answer12 {
    public static double sum(ArrayList<Double> list) {
        double sum = 0.0;
        for( int i =0; i < list.size(); ++i)
            sum += list.get(i);
        
    return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter 5 number:");
        for(int i =0; i < 5; ++i)
            list.add(sc.nextDouble());
    
        System.out.println("The sum of elements is :"+sum(list));

        sc.close();
    }
}