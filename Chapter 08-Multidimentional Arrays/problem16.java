import java.util.Scanner;
public class problem16 {
    public static void sort(int[][] m) {
        int[] min = new int[2];
		for (int row = 0; row < m.length - 1; row++) {
			min[0] = m[row][0]; 
			min[1] = m[row][1]; 
			int index = row;
			for (int i = row + 1; i < m.length; i++) {
				if (m[i][0] <= min[0] && (m[i][0] < min[1] || 
					 m[i][1] < min[0] || m[i][1] < min[1])) { 
					min[0] = m[i][0];
					min[1] = m[i][1];
					index = i;
				}
			}
			if (index != row){
				m[index][0] = m[row][0];
				m[index][1] = m[row][1];
				m[row][0] = min[0];
				m[row][1] = min[1]; 
			}
		}
    //print array
    for( int i = 0 ; i < m.length ; ++i){
        for( int j= 0; j < m[0].length; ++j){
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
    }
       
    }

    public static void main(String[] args) {
        int m[][] = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
        sort(m);
    }
   
}