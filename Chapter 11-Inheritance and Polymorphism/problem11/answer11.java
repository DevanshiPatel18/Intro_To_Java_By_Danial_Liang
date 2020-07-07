package problem11;

import java.util.Scanner;
import java.util.ArrayList;

public class answer11 {
    public static void sort(ArrayList<Double> list) {
        for(int i =0; i < list.size() - 1; ++i){
            for(int j =i+1; j < list.size(); ++j){
                if ( list.get(i) > list.get(j)){
                    Double temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new  ArrayList<>();

        System.out.println("Enter n");
        int n =sc.nextInt();
        for(int i =0; i < n; ++i){
            list.add(sc.nextDouble());
        }

        sort(list);

        System.out.println(list);

        sc.close();
    }
}