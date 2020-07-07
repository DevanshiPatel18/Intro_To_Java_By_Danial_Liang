import java.util.Scanner;
public class problem6 {
    public static double[][] multiplyMatrix(double[][] a , double[][] b){
        double[][] c = new double[3][3];

        for( int i =0; i < a.length; ++i){
            for(  int j = 0; j < a[0].length; ++j){
                double sum =0;
                for( int k =0; k < a.length; ++k){
                    sum += a[i][j]*b[k][j];
                }

                c[i][j] = sum;
            }
        }
    return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        System.out.println("Enter matrix1:");
        for( int i=0; i < 3; ++i){
            for( int j =0 ;j <3; ++j){
                a[i][j] = sc.nextDouble();
            }
        }
    
        System.out.println("Enter matrix2:");
        for( int i=0; i < 3; ++i){
            for( int j =0 ;j <3; ++j){
                b[i][j] = sc.nextDouble();
            }
        }

        double[][] c = multiplyMatrix(a, b);
        //print a
        for( int i=0; i < 3; ++i){
            for( int j =0 ;j <3; ++j){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    sc.close();
    }
}