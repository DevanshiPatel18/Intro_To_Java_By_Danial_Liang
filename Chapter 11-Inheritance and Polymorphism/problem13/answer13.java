package problem13;

import java.util.ArrayList;
import java.util.Scanner;

public class answer13 {
    public static void removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0 ; i < list.size(); ++i){
            int num = list.get(i);
            if ( !temp.contains(num) ){
                temp.add(num);
            }
        }
        list.clear();
        for(int i =0; i < temp.size(); ++i)
            list.add(temp.get(i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 number:");
        for(int i =0 ;i < 10; ++i)
            list.add(sc.nextInt());
        
        removeDuplicates(list);

        System.out.println(list);
        
        sc.close();
    }
}