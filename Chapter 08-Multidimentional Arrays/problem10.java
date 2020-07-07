public class problem10 {
    public static int[][] getRandomMatrix(){
        int[][] array = new int[4][4];
        
        for( int i =0; i < array.length; ++i){
            for( int j =0 ; j < array.length; ++j){
                array[i][j] = (int)(Math.random()*2);
            }
        }
        return array;
    }

    public static int[] largestRowAndColumnIndex(int[][] matrix){
        int[] index = new int[2];
        int countRow =0 ;
        int countColumn =0;
        for( int i =0; i < matrix.length; ++i){
            int tempRow =0 ;
            int tempColumn = 0;
            for( int j = 0 ; j < matrix.length; ++j){
                if (matrix[i][j] == 1)
                    tempRow++;
                if (matrix[j][i] == 1)
                    tempColumn++;
            }
            if (tempColumn > countColumn){
                countColumn = tempColumn;
                index[1] = i;
            }
            if ( tempRow > countRow){
                countRow = tempRow;
                index[0] = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[][] matrix = getRandomMatrix();
        
        for( int i =0 ; i < matrix.length; ++i){
            for( int j = 0 ; j < matrix.length; ++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int[] answer = largestRowAndColumnIndex(matrix);
        System.out.println("The largest row index:"+answer[0]);
        System.out.println("The largest column index:" + answer[1]);
    }
    
}