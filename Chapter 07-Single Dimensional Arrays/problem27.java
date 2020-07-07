import java.util.Scanner;
import java.util.Arrays;
public class problem27 {
    public static boolean equals(int[] list1, int[] list2) {
        Arrays.sort(list1);
        Arrays.sort(list2);

        for( int i =0 ; i < list1.length; ++i){
            if ( list1[i] != list2[i])
                return false;
        }

        return true;
        
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter list1:");
        int size = sc.nextInt();
        int[] list1 = new int[size];
        for ( int i =0 ;i < list1.length; ++i)
            list1[i] = sc.nextInt();
        
        System.out.println("Enter list1:");
        size = sc.nextInt();
        int[] list2 = new int[size];
        for ( int i =0 ; i < list2.length; ++i)
            list2[i] = sc.nextInt();
        
            if(equals(list1,list2))
                System.out.println("The lists are identical ");
            else
                System.out.println("the lists are not identical");
        sc.close();
            }
}