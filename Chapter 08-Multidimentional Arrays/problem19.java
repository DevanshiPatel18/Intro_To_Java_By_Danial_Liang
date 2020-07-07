import java.util.Scanner;
public class problem19 {
    public static boolean isconsecutiveFour(int[][] values){
        //row-wise
        for( int i =0 ; i < values.length; ++i){
        if(consecutiveFOurInRow(values,i)){
        System.out.println("Hi");
            return true;
        }
        }
        //column-wise
        for( int i=0; i < values[0].length; ++i){
            if(consecutiveFourInColumn(values,i)){
                System.out.println("Hi2");            
                return true;
            }
        }

        //major & minor diagonal wise
        if(values.length >= 4){
            if(ConsecutiveFourinDiagonal(values)){
             System.out.println("hi3");
                return true;
            }
        }

        return false;
    }

    public static boolean consecutiveFOurInRow(int[][] values, int row) {
        
        for( int i =0 ; i < values[0].length - 4; ++i){
            int number = values[row][i];
            if (values[row][i+1] == number && values[row][i+2] == number && values[row][i+3] == number )
                return true;
        }
        return false;
    }

    public static boolean consecutiveFourInColumn(int[][] values, int column) {
        
        for( int i =0 ; i < values.length - 4; ++i){
            int number = values[i][column];
            if (values[i+1][column] == number && values[i+2][column] == number && values[i+3][column] == number )
                return true;
        }
        return false;
    }

    public static boolean ConsecutiveFourinDiagonal(int[][] values) {
        //check for major diagonal direction via columns
        for( int i = 0; i  < values[0].length ;++i){
          
                int count =0 ;
                int number = values[0][i];
                for( int j =i+1; j < values[0].length; ++j){
                    try{
                    if ( values[j][j+1] == number)
                        count++;
                    }
                    catch(Exception e){
                        if ( count >= 4 )
                            return true;
                    }
                }

            
        }

        //check for major diagonal via the direction of rows
        for( int i =0 ; i < values.length; ++i){
            
                int count =0 ;
                int number = values[i][0];
                for( int j = i+1; j < values[0].length; ++j ){
                 try {
                     if (values[i][j] == number)
                     count++;
                 } catch (Exception e) {
                     if(count >=4)
                        return true;                
                     }
                }
            
        }

        //check for minor diagonal via the direction of columns
        for( int i = values[0].length - 1; i >=0 ;--i){
           
                int count =0 ;
                int number = values[0][i];
                for( int j =i-1; j >=0; --j){
                    try{
                    if ( values[j][j+1] == number)
                        count++;
                    }
                    catch(Exception e){
                        if ( count >= 4 )
                            return true;
                    }
                }

            
        }

        //check for minor diagonal via the direction of rows
        for( int i =values.length -1; i >= 0; --i){
            
                int count =0 ;
                int number = values[i][0];
                for( int j = values[0].length-1; j >= 0; --j ){
                 try {
                     if (values[i][j] == number)
                     count++;
                 } catch (Exception e) {
                     if(count >=4)
                        return true;                
                     }
                }
            
        }
        return false;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for rows and column of matrix:");
        int[][] values = new int[sc.nextInt()][sc.nextInt()];

        System.out.println("Enter the matrix:");
        for( int i =0 ; i < values.length; ++i){
            for (int j = 0 ;j  < values[0].length; ++j){
                values[i][j] = sc.nextInt();
            }
        }
        if (isconsecutiveFour(values))
            System.out.println("There are 4 consecutive numbers");
        else
            System.out.println("There are no 4 consecutive numbers");
    
        sc.close();
        }
}