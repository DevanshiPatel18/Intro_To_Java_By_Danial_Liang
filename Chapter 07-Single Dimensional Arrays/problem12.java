import java.util.Scanner;
import java.util.Arrays;
public class problem12 {
        public static double[] reverse(double[] array){
            double[] result = new double[array.length];

            for( int i =0; i < array.length; ++i){
                result[array.length-i-1] = array[i];
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] array = new double[10];

            System.out.print("Enter 10 numbers: ");

            for( int i =0; i<array.length; ++i){
                array[i] = sc.nextDouble();
            }

            System.out.println("The reversed array is: "+Arrays.toString(reverse(array)));
            
            sc.close();
        }
}