import java.util.Scanner;
public class problem28 {
    public static boolean equals(int[][] m1, int[][] m2) {
        for( int i =0 ; i < m1.length; ++i){
            for( int j =0 ; j < m1.length; ++j){
                if (m1[i][j] != m2[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        System.out.print("Enter list1: ");
        for( int i =0 ; i < m1.length; ++i){
            for( int j =0 ; j < m1.length; ++j){
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for( int i =0 ; i < m2.length; ++i){
            for( int j =0 ; j < m2.length; ++j){
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The lists are "+(equals(m1,m2) ? "strickly equal": "not strickly equal" ));
    sc.close();
    }
}