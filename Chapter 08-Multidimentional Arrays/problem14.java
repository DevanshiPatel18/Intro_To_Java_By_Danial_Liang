import java.util.Scanner;
public class problem14 {
        public static int[] checkForRows(int[][] matrix,int k){
            int[] answer = new int[2];
            answer[0]= k;
            answer[1]=matrix[k][0];

            for( int i =0; i < matrix.length; ++i){
                if ( matrix[k][i] != answer[1])
                    {
                        answer[0] = -1;
                        break;
                    }
            }
            return answer;
        } 

        public static int[] checkForColumn(int[][] matrix, int k){
            int[] answer = new int[2];
            answer[0] = k;
            answer[1] = matrix[0][k];
        
            for( int i =0 ; i < matrix.length; ++i){
                if ( matrix[i][k] != answer[1]){
                    answer[0] = -1;
                    break;
                }
            }
            return answer;
        }

        public static boolean checkForDiagonal(int[][] matrix) {
            int num = matrix[0][0];
            for( int i=1; i < matrix.length; ++i){
                if ( num != matrix[i][i]){
                    return false;
                }
            }
            return true;
        }

        public static boolean checkForSubDiagonal(int[][] matrix) {
            int num = matrix[0][matrix.length-1];
            int row = 1;
            for( int i =matrix.length -2 ; i >= 0; --i){
                if (num != matrix[row][i])
                    return false;
                ++row;
            }
            return true;
            
        }

        public static int[][] getMatrix(int number) {
            int[][] matrix = new int[number][number];

            for( int i =0 ; i < matrix.length; ++i){
                for( int j = 0; j < matrix.length; ++j){
                    int n = (int)(Math.random()*2);
                    matrix[i][j] = n;
                }
            }

            return matrix;
        }

        public static void showMatrix(int[][] matrix) {
            for( int i =0 ; i < matrix.length; ++i){
                for( int j = 0; j  <matrix.length; ++j){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the square matrix:");
            int number = sc.nextInt();

            int[][] matrix = getMatrix(number);

            showMatrix(matrix);
            int count =0 ;
            //check for rows
            for( int i =0; i < matrix.length; ++i){
                int[] answer = checkForRows(matrix,i);
                if ( answer[0] != -1){
                    System.out.println("All "+answer[1]+"s on row "+answer[0]);
                    count++;
                }
                }
            if (count == 0)
                System.out.println("No same numbers on a row");
            
                count =0;
            //check for columns
            for( int i = 0 ; i <matrix.length; ++i){
                int[] answer = checkForColumn(matrix,i);
                if ( answer[0] != -1){
                    System.out.println("All "+answer[1]+"s on column "+answer[0]);
                    count++;
                }
            }
            if ( count == 0)
                System.out.println("No same numbers on a column");

                //diagoanl
            if (checkForDiagonal(matrix))
                System.out.println("All "+matrix[0][0]+"s on the diagonal");
            else
                System.out.println("No same numbers on the major diagonal");

                // for minor diagonal
                if (checkForSubDiagonal(matrix))
                    System.out.println("All "+matrix[matrix.length -1][0]+"s on the minor diagonal");
                else    
                    System.out.println("No same numbers on the minor diagonal");
                sc.close();
            }
         }