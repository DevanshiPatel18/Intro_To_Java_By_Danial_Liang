import java.util.Scanner;
public class problem8 {
    public static int average(int[] array){
        int sum=0 ;
        for( int i =0 ; i < array.length; ++i){
            sum += array[i];
        }

        return sum/array.length; 
    }

    public static double average(double[] array){
        double sum=0 ;
        for( int i =0 ; i < array.length; ++i){
            sum += array[i];
        }

        return sum/array.length; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];

        for( int i =0; i < array.length; ++i){
            array[i] = sc.nextDouble();
        }

        System.out.println("The average is: "+average(array));
        sc.close();
    }

}