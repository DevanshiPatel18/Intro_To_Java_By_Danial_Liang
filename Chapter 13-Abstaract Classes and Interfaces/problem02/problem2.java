package problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class problem2 {
    public static void displayList(ArrayList<Number> list){
        for(Number i: list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void shuffle(ArrayList<Number> list) {
        for(int i =0; i < list.size() - 1; ++i){
            int randomIndex = (int)(Math.random()*list.size());
            Number temp = list.get(i);
            //swap those elements
            list.set(i,list.get(randomIndex));
            list.set(randomIndex,temp);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Number> list = new ArrayList<>(); 

        System.out.println("Enter numbers: (enter q to exit)");

        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }

        displayList(list);

        shuffle(list);

        displayList(list);

        sc.close();
    }
}