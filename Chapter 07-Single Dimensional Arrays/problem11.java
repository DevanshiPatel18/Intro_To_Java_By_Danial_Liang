import java.util.Scanner;

public class problem11 {
    public static double deviation(double[] array) {
        double sum =0.0 ;
        double mean = mean(array);
        for( int i =0 ; i < array.length; ++i){
            sum += Math.pow(array[i] - mean,2);
        }        

        return Math.sqrt(sum/(array.length - 1));
    }    

    public static double mean(double[] array) {
        double sum = 0.0;
        for( int i =0; i < array.length; ++i){
            sum += array[i];
        }        
        return sum/array.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[10];

        System.out.print("Enter 10 numbers: ");
        for( int i =0 ; i < array.length; ++i){
            array[i] = sc.nextDouble();
        }

        System.out.printf("The mean is: %.2f \n", mean(array) );
        System.out.printf("The standard devaition is: %.5f",deviation(array));
        sc.close();
    }
}