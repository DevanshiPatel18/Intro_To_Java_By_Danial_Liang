import java.util.Scanner;

public class problem31 {
 public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];
       
        for( int i =0; i < list1.length; ++i){
            list3[i] = list1[i];
        }

        for( int i =0, j = list1.length ; i < list2.length; ++i,++j )
            list3[j] = list2[i];
        
        return sort(list3);
        
    }

    public static int[] sort(int[] list){

        java.util.Arrays.sort(list);

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list1:");
        int size = sc.nextInt();
        int[] list1 = new int[size];
        for( int i =0 ; i < list1.length; ++i)
            list1[i] = sc.nextInt();

        System.out.print("Enter list2");
        size = sc.nextInt();
        int[] list2 = new int[size];
        for ( int i = 0 ; i < list2.length; ++i)
            list2[i] = sc.nextInt();

        int[] list = merge(list1, list2);

        for( int i =0 ; i < list.length; ++i)
            System.out.print(list[i]+" ");
    sc.close();
        }
}