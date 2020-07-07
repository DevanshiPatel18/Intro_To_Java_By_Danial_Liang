public class problem20 {
    public static void showConnectFourBoard(char[][] board) {
        for( int i = 0; i < board.length; ++i){
            for( int j = 0; j < board[0].length; ++j){
                System.out.print("|"+board[i][j]+"|");
            }

            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static char[][] addDisk(char[][] board,int column,char player) {
        for(int i = board.length - 1; i >=0; --i){
            if(board[i][column] == 'R' || board[i][column] == 'Y')
                continue;
            board[i][column] = player;
        }

        return board;
    }

    public static boolean checkIfWon(char[][] board,char player) {
        return false;
    }
}