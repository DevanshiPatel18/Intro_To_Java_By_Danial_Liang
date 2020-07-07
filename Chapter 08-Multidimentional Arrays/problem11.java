import java.util.Scanner;
public class problem11 {
    public static int[][] getBinaryMatrix(int number) {
        int[][] matrix = new int[3][3];
      
        for(int i = matrix.length-1; i >=0 ; --i){
            for( int j = matrix.length-1; j >= 0; --j){
                matrix[i][j] = number%2;
                number /= 2;
            }
        }
     
        return matrix;
    }

    public static void showMatrix(int[][] matrix) {
        for( int i =0 ; i < matrix.length; ++i){
            for( int j =0; j < matrix.length; ++j){
                if (matrix[i][j] == 1)
                    System.out.print("T"+" ");
                else
                    System.out.print("H"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 511:");
        int number = sc.nextInt();

        int[][] matrix = getBinaryMatrix(number);
        showMatrix(matrix);
    sc.close();
    }
}