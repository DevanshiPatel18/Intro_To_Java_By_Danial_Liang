import java.util.Scanner;
public class problem32 {
    public static int patition(int[] list){
        int pivot = list[0];
        int length = list.length;
        int mid = length/2;;
        int temp = pivot;
        pivot = mid;
        mid = pivot;
        int[] newList = new int[length];

        newList[length/2] = pivot;
        for( int i =0 ; i < newList.length; ++i){
            if ( i == length/2)
                continue;
            else
            {
                if ( list[i] < pivot)
                    newList[list.length+i+1] = list[i];
                else    
                    newList[i] = list[i];
                }
        }

        return newlist[length/2];

    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lisst:");
        int size = sc.nextInt();
        int[] list ;
    }
}