import java.util.Scanner;

public class problem19 {
    public static boolean isSorted(int[] list){
        for( int i =0; i < list.length-1; ++i){
            if ( list[i] > list[i+1])
                return false;
        }
        return true;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list:");
        int size = sc.nextInt();

        int[] list = new int[size];

        for( int i = 0; i < list.length; ++i){
            list[i] = sc.nextInt();
        }

        if( isSorted(list))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");

        sc.close();
    }
}