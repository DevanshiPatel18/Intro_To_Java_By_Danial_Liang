import java.util.Scanner;
public class problem27 {
    public static double[][] sortColumns(double[][] m){
        for( int i =0 ; i < m.length; ++i){
            for(int j =0; j < m.length -1; ++j){
                for( int k = j+1; k < m.length; ++k){
                    if (m[j][i] > m[k][i]){
                        double temp = m[j][i];
                        m[j][i] = m[k][i];
                        m[k][i] = temp;
                    }
                }
            }
        }
        return m;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3x3 matrix row by row:");
        for( int i =0 ; i < matrix.length; ++i){
            for( int j = 0; j < matrix.length; ++j){
                matrix[i][j] = sc.nextDouble();
            }
        }

        matrix = sortColumns(matrix);
        System.out.println();
        for( int i =0 ; i < matrix.length; ++i){
            for( int j= 0; j < matrix.length; ++j){
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}