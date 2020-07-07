import java.util.Scanner;
public class problem29 {
    public static int[][] sort(int[][] m) {
        for( int i =0; i < m.length; ++i){
            for( int j =0; j < m.length-1; ++j){
                for( int k =j+1 ; k  <m.length; ++k){
                    if (m[i][j] > m[i][k]){
                        int temp = m[i][j];
                        m[i][j] = m[i][k];
                        m[i][k]= temp;
                    }
                }
            }
        }
        return m;
    }
    public static boolean equals(int[][] m1, int[][] m2){
        m1 = sort(m1);
        m2 = sort(m2);
        for( int i =0 ; i < m1.length; ++i){
            for( int j =0 ; j < m2.length; ++j){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for( int i =0 ; i < m1.length; ++i){
            for( int j =0 ; j < m2.length; ++j){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        for( int i =0; i < m1.length; ++i){
            for( int j =0; j < m2.length; ++j){
                if (m1[i][j] != m2[i][j] )
                    return false;    
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        System.out.println("Enter list1:");
        for( int i =0 ; i < m1.length; ++i){
            for(int j = 0 ; j < m1.length; ++j){
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter list2:");
        for( int i =0 ; i < m2.length; ++i){
            for(int j = 0 ; j < m2.length; ++j){
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The lists are "+(equals(m1,m2)? "identical.":"not identical."));
    sc.close();
    }
}