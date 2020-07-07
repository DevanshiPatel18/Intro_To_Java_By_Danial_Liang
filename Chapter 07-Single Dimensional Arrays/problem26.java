import java.util.Scanner;
public class problem26 {
    public static boolean equals(int[] list1, int[] list2){
        
       for( int i =0; i < list1.length; ++i){
        if (list1[i] != list2[i])
            return false;
       }

       return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list1:");
        int size1 = sc.nextInt();
        int[] list1 = new int[size1];
        for( int i= 0; i < size1; ++i)
            list1[i] = sc.nextInt();

        System.out.print("Enter list2:");
        int size2 = sc.nextInt();
        int[] list2 = new int[size2];
        for (int i =0; i < list2.length; ++i)
            list2[i] = sc.nextInt();

       if (equals(list1,list2))
        System.out.println("Two lists are strictly identical");
        else
            System.out.println("Teo lists are not identical");
        sc.close();
        }
}