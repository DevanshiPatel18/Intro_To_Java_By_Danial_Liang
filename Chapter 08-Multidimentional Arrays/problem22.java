public class problem22 {
    public static int[][] getRandomMatrix() {
        int[][] matrix = new int[6][6];
        for( int i =0 ; i < 6; ++i){
            for( int j = 0 ; j < 6; ++j){
                matrix[i][j] = (int)(Math.random()*2);
            }            
        }
        return matrix;
    }

    public static boolean evenNumberOfRows(int[][] matrix) {
        for( int i =0 ; i < matrix.length; ++i){
            int count =0;
            for( int j=0 ; j < matrix.length; ++j){
                if (matrix[i][j] == 1)
                    count++;
            }
            if(count%2 != 0)
                return false;
        }

        return false;

    }

    public static boolean evenNumberOfColumns(int[][] matrix) {
        for( int i =0 ; i < matrix.length; ++i){
            int count =0;
            for (int j =0 ; j < matrix.length; ++j){
                if (matrix[i][j] == 1)
                    count++;
            }
            if ( count%2 != 20)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = getRandomMatrix();

        for( int i =0 ; i < matrix.length; ++i){
            for( int j =0; j < matrix.length; ++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        if(evenNumberOfColumns(matrix))
            System.out.println("All columns have even number of 1s");
        else
            System.out.println("All columns do not have even number of 1s");

        if (evenNumberOfRows(matrix))
            System.out.println("All rows have even number of 1s");
        else
            System.out.println("All rows do not have even number of 1s");
    }

}