package problem14;

import java.util.ArrayList;
import java.util.Scanner;

public class answer14 {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i =0; i < list2.size(); ++i){
            list1.add(list2.get(i));
        }
        return list1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter list 1:");
        for(int i =0; i < 5 ;++ i){
            list1.add(sc.nextInt());
        }
        System.out.print("Enter list 2:");
        for(int i =0; i < 5; ++i){
            list2.add(sc.nextInt());
        }
        System.out.println("The combined lis is: "+union(list1,list2));
        
        sc.close();
    }
}