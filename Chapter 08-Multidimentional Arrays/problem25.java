import java.util.Scanner;
public class problem25{
    public static boolean areAllPositive(double[][] m ) {
        for( int i =0; i < m.length; ++i){
            for( int j = 0; j  < m.length; ++j){
                if (m[i][j] < 0)
                    return false;
            }
        }

        return true;
    }
    
    public static double findColumnSum(double[][] m,int column) {
        double sum =0;
        for( int i =0 ; i < m.length; ++i){
            sum += m[i][column];
        }
        return sum;
    }

    public static boolean isMarkovMatrix(double[][] m){
        if(areAllPositive(m)){
            for( int i = 0; i  < m.length; ++i){
                if(findColumnSum(m,i) != 1)
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3x3 matrix row by row:");

        for( int i =0; i < matrix.length; ++i){
            for( int j = 0; j  < matrix.length; ++j){
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("It is "+(isMarkovMatrix(matrix) ? "a":"not a")+" Markov Matrix.");

    sc.close();
    }
}