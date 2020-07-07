package problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class answer4 {
    public static Integer max(ArrayList<Integer> list) {
        if (!list.isEmpty())
            return java.util.Collections.max(list);
        else
            return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.println("Enter elements in list (enter no to exit)");
        try {
            while(true)
                list.add(sc.nextInt());
        } catch (Exception e) {
            
        }

        System.out.println("The maximum number is :"+max(list));
        
        sc.close();
    }
}