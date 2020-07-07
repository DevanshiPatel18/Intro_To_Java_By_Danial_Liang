import java.util.Scanner;
import java.util.Arrays;

public class problem15 {
    public static boolean linearSearch(int[] array,int key){
        for ( int i =0 ; i < array.length; ++i){
            if (array[i] == key)
                return false;
        }
        return true;
    }
    public static int[] eliminateDuplicates(int[] list){
        System.out.println(Arrays.toString(list));  int[] newList = new int[list.length];
       
        int count =0 ;
        for( int i =0; i < list.length; i++){

            if (linearSearch(newList,list[i])){
                newList[count] = list[i];
                count++;
            }
           
        }

        return newList;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.print("Enter 10 numbers: ");
        for( int i =0 ; i < array.length; ++i)
            array[i] = sc.nextInt();

        array = eliminateDuplicates(array); 
        System.out.print("The distinct numbers are:");
        for( int i =0 ; i <array.length; ++i){
            if ( array[i] != 0)
            System.out.print(array[i]+" ");
        }

        sc.close();
    }
}