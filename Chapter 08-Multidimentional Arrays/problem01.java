import java.util.Scanner;

public class problem1{

    public static double sum(double[][] m, int columnIndex){
        double sum = 0;
        for( int i = 0; i < m.length; ++i)
           sum += m[i][columnIndex];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-by-4 matrix row by row:");
        double[][] m = new double[3][4];

        for( int i =0; i < m.length; ++i){
            for( int j =0; j < m[0].length;++j){
                m[i][j] = sc.nextDouble();
            }
        }

        for( int i = 0; i < m[0].length; ++i)
        {
            System.out.println("Sum of the elements at column "+i+" is "+sum(m,i));
        }
    
        sc.close();
    }
}
