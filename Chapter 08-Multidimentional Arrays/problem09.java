import java.util.Scanner;

public class problem9 {
    public static void showTicTacToeBoard(int[][] plays) {
        System.out.println("-------------");
        for( int i =0 ; i < plays.length; ++i){
            for( int j =0 ; j < plays.length; ++j){
                String item ;
                if ( plays[i][j]==2)
                    item = "O";
                else if (plays[i][j]==1)
                    item = "X";
                else 
                    item = " ";
                System.out.print("|"+item+"  ");
            }
           
            System.out.println("|"+"\n-------------");
        }
    }
    public static boolean playerWins(int[][] plays,int player) {
            if (isVerticalWin(plays,player))
                return true;
    
            if (isHorizontalWin(plays,1)) 
                return true;
            if (isDiagonalWin(plays, 1))    
                return true;

            return false;
        }
    public static boolean isVerticalWin(int[][] playes, int player) {
        
        for( int i =0; i <playes.length; ++i){
            int count =0;
            for( int j =0 ; j < playes.length; ++j) {
                if (playes[i][j] == player){
                    count++;
                
                    }    else
                    break;
                
            } 
            if ( count ==3 )
                return true;  
        }

        return false;
    }

    public static boolean isHorizontalWin(int[][] playes, int player) {
        
        for( int i =0; i <playes.length; ++i){
            int count =0;
            for( int j =0 ; j < playes.length; ++j) {
                if (playes[j][i] == player){
                    count++;
                
                    }    else
                    break;
                
            } 
            if ( count ==3 )
                return true;  
        }

        return false;
    }

    public static boolean isDiagonalWin(int[][] playes, int player) {
        
        
            int count =0;
            for( int j =0 ; j < playes.length; ++j) {
                if (playes[j][j] == player){
                    count++;
                
                }    else
                    break;     
            } 
            if ( count ==3 )
                return true;  

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] plays = new int[3][3];
        int count =0;
        showTicTacToeBoard(plays);

        while(true){
            count++;
        System.out.print("Enter a row (0,1,2) for player X: ");
        int Xrow = sc.nextInt();

        System.out.print("Enter a column (0,1,2) for player X: ");
        int Xcolumn = sc.nextInt();

        plays[Xrow][Xcolumn] =1;
        showTicTacToeBoard(plays);
        if (playerWins(plays,1)){
            System.out.println("Player X has won !!");
            break;
        }
            count++;
        System.out.print("Enter a row (0,1,2) for player O: ");
        int Orow = sc.nextInt();

        System.out.print("Enter a column (0,1,2) for player O: ");
        int Ocolumn = sc.nextInt();

        plays[Orow][Ocolumn] =2;

        showTicTacToeBoard(plays);
        if (playerWins(plays,2)){
            System.out.println("Player O has won !!");
            break;
        }
            if (count == 9){
                System.out.println("TIE !");
                break;}
    }
    sc.close();
    }

}