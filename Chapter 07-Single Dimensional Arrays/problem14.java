import java.util.Scanner;
import java.util.Arrays;

public class problem14 {
    public static int gcd(int... numbers){
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int gcd = 1;
        for( int i = 2; i <= numbers[0]; ++i){
            int flag = 0;
            for( int j = 0 ; j < numbers.length; ++j){
                if ( i == numbers[j])
                    continue;
                if (numbers[j] % i != 0){
                    flag = 1;
                    break;
                }
            }
            if ( flag == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter 5 numbers: ");
        for( int i =0; i < array.length; ++i){
            array[i] = sc.nextInt();
        }

        System.out.println("The gcd of these numbers is: "+gcd(array));
        sc.close();
    }
}