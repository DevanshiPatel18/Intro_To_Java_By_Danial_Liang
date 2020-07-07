import java.util.Scanner;
public class problem23 {

    public static boolean checkRowandColumn(int[][] array, int row,int column){
        //check row
        int count =0;
        boolean flag1=false,flag2=false;
        for( int i =0 ; i < array[0].length; ++i){
            if( array[row][i] == 1 )
                count++;
        }
        if (count%2 !=0)
            flag1=true;
        
        //check column
        count= 0;
        for( int i = 0; i < array.length; ++i){
            if ( array[i][column] == 1)
                count++;
        }

        if (count%2 !=0 )
            flag2 =true;

        if ((flag1 == true && flag2 == true))
            return true;
        else
        return false;
    }
    public static void check(int[][] array) {
        for( int i =0 ; i < array.length; ++i){
            int flag=0;
            for( int j =0 ; j < array.length; ++j){
               if(checkRowandColumn(array,i,j)){
                System.out.println("The flipped cell is at ("+i+","+j+")");
                flag=1;
                break;
            }
            if (flag==1)
                break;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 6-by-6 matri8x row by row:");
        int[][] array = new int[6][6];

        for( int i =0 ; i < array.length; ++i){
            for( int j =0 ; j < array.length; ++j){
                array[i][j] = sc.nextInt();
            }
        }

        check(array);

    }
}