import java.util.Scanner;
public class problem5 {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];

        for( int i =0 ;i < a.length; ++i){
            for( int j = 0; j < a[0].length; ++j){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        System.out.print("Enter 3x3 matrix a: ");
        for( int i=0 ;i <3; ++i){
            for( int j =0 ; j < 3; ++j){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter 3x3 matrix b: ");
        for( int i=0 ;i <3; ++i){
            for( int j =0 ; j < 3; ++j){
                b[i][j] = sc.nextInt();
            }
        }

        double[][] c = addMatrix(a,b);

        for( int i =0 ; i < 3; ++i){
            for( int j = 0; j < 3; ++j){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}