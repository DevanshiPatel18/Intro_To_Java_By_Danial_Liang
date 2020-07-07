import java.util.Scanner;

public class problem5 {

        public static boolean isDistinct(int arr[], int num){

            for( int i=0; i < arr.length; ++i){
                if( arr[i] == num)
                    return false;
            }
            return true;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 numbers:");

        int[] arr = new int[10];
        int count =0;

        for( int i =0; i < 10; ++i){
            int num = sc.nextInt();
            
            if ( isDistinct(arr,num)){
                arr[count] = num;
                count++;
            }
           
        }

        sc.close();
        System.out.println("The number of distinct numbers are: "+count);
        System.out.println("The numbera are:");
        for( int i =0; i < arr.length; ++i){
            if ( arr[i] > 0)
                System.out.print(arr[i]+" ");
        }
        

        
    }
}