import java.util.Scanner;
public class problem13 {
    public static int[] locateLargest(double[][] a) {
        double largest = a[0][0];
        int[] index = new int[2];
        for( int i =0 ; i < a.length; ++i){
            for( int j = 0; j  < a[0].length; ++j){
                if (largest < a[i][j]){
                    largest = a[i][j];
                    index[0] = i;
                    index[1] = j;
                }      
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        double[][] a = new double[rows][columns];

        System.out.println("Enter the array:");
        for( int i =0; i < a.length; ++i){
            for( int j = 0; j < a[0].length; ++j){
                a[i][j] = sc.nextDouble();
            }
        }

        System.out.println("The location of the largest element is at "+java.util.Arrays.toString(locateLargest(a)));
        sc.close();
    }
}