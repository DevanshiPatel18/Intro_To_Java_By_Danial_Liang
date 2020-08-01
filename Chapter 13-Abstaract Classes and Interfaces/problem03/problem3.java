package problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class problem3 {
    public static void sort(ArrayList<Number> list) {
        for(int i =0; i < list.size() - 1; ++i){
            for(int j =i; j < list.size(); ++j){
                if (list.get(i).intValue() > list.get(j).intValue()){
                    Number temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println();
    }

    public static void display(ArrayList<Number> list) {
        for(Number i : list)
            System.out.print(i+" ");
        
            System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Number> list = new ArrayList<>();

        System.out.print("Enter elements:(enter a letter to quit)");
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
    }
    
        display(list);

        sort(list);

        display(list);

        sc.close();
    }
}