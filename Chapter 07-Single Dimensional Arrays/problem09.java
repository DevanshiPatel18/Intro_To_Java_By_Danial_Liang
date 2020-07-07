import java.util.Scanner;

public class problem9 {
    public static double min(double[] array){
        double min = array[0];

        for( int i =0; i < array.length; ++i){
            if ( min > array[i])
                min = array[i];
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 values:");

        double[] array = new double[10];

        for( int i =0; i < array.length; ++i){
            array[i] = sc.nextDouble();
        }

        System.out.println("The smallest number is: "+min(array));
    
        sc.close();
    }
}