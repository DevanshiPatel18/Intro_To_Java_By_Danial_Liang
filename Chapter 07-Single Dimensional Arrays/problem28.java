import java.util.Scanner;
public class problem28 {
    public static void combinations(int[] array) {
        for( int i = 0; i < array.length - 1; ++i){
            for ( int j = i+1; j < array.length ; ++j){
                System.out.println(array[i]+" "+array[j]);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.print("Enter 10 numbers:");
        for ( int i =0 ; i < array.length; ++i)
            array[i] = sc.nextInt();

        combinations(array);

        sc.close();
    }
}