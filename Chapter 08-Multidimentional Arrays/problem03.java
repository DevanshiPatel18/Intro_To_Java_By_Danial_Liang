
public class problem3 {
    public static int[][] getScores(char[][] answers,char[] keys) {
        int[][] scores = new int[2][answers.length];

        for( int i =0; i < answers.length; ++i){
            scores[1][i] =i;
            for( int j =0; j < answers[0].length; ++j){
                if (answers[i][j] == keys[j])
                    scores[0][i]++;
            }
        }
       
    return scores;
        
    }

    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
             {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] keys = {'D','B','D','C','C','D','A','E','A','A'};

        int[][] scores = getScores(answers,keys);
            // arrange the scores wrt to the scores in increasing order
        for( int i =0; i < scores[0].length -1; ++i){
            for( int j = i+1; j < scores[0].length; ++j){
                if( scores[0][i] < scores[0][j]){
                    int temp;
                    //swap score
                    temp = scores[0][i];
                    scores[0][i] = scores[0][j];
                    scores[0][j] = temp;
                    //swap student no
                    temp = scores[1][i];
                    scores[1][i] = scores[1][j];
                    scores[1][j] = temp;
                }
            }
        }

            for( int j =0 ;j < scores[0].length; j++){
                System.out.println("Student no "+scores[1][j]+" scored " +scores[0][j]);
            }
        
    }
}