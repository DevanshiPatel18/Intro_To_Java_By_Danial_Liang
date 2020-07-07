package problem15;

import java.util.ArrayList;
import java.util.Scanner;

public class answer15 {
    public static double getArea(ArrayList<ArrayList<Double>> list) {
        double sum =0.0;
        //compute sum of squares
        for(int i = 0; i < list.size() - 1; ++i){
            double x1 = list.get(i).get(0);
            double y1 = list.get(i).get(1);
            double x2 = list.get(i+1).get(0);
            double y2 = list.get(i+1).get(1);

            sum += ((x1*y2) - (x2*y1));
        }
        return Math.abs(sum/2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Double>> list = new ArrayList<>();

        System.out.print("Enter the number of points:");
        int n = sc.nextInt();
        System.out.println("Enter the coordinates of the points:");
        for(int i =0; i < n; ++i){
            ArrayList<Double> temp = new ArrayList<>();
            temp.add(sc.nextDouble());
            temp.add(sc.nextDouble());
            list.add(temp); 
        }

        System.out.println("The area is : " +getArea(list));
        sc.close();
    }
}