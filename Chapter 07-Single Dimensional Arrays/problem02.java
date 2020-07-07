import java.util.Scanner;
import java.util.Arrays;
public class problem2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[10];
            
            System.out.println("Enter 10 numbers:");
            for( int i =0; i < 10 ; ++i){
                arr[9-i] = sc.nextInt();
            }
            sc.close();
            System.out.println(Arrays.toString(arr));
        }
}