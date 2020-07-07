import java.util.Scanner;
public class problem26 {
    public static double[][] sortRows(double[][] m) {
        for( int i =0 ; i < m.length; ++i){
            for( int j =0 ; j < m.length -1; ++j){
                for( int k =j+1; k < m.length; ++k){
                    if(m[i][j] > m[i][k]){
                        double temp = m[i][j];
                        m[i][j] = m[i][k];
                        m[i][k] = temp;
                    }
                }
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3x3 matrix:");
        double[][] array = new double[3][3];

        for( int i =0; i < array.length; ++i){
            for( int j= 0 ; j < array.length; ++j){
                array[i][j] = sc.nextDouble();
            }
        }

        array = sortRows(array);

        for(int i =0 ; i < array.length; ++i){
            for( int j =0 ; j < array.length; ++j){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}