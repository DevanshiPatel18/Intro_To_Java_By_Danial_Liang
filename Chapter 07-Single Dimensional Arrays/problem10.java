import java.util.Scanner;

public class problem10 {
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int index = -1;
        for( int i = 0; i < array.length; ++i){
            if( min > array[i]){
                min = array[i];
                index =i;
            }
        }

        return index;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double[] array = new double[10];

        for( int i = 0; i <array.length; ++i){
            array[i] = sc.nextDouble();
        }

        System.out.println("The index of smallest number is: "+indexOfSmallestElement(array));
        sc.close();
    }
}