import java.util.Scanner;
public class problem34 {
    public static double[] getRightmostLowestPoint(double[][] points){
        double[] answer = new double[2];
        answer[0] = points[0][0];
        answer[1] = points[0][1];

        for( int i =0 ; i < points.length; ++i){
            if (points[i][0] >= answer[0] && points[i][1] <= answer[1]){
                answer[0] = points[i][0];
                answer[1] = points[i][1];
            }
    }
    return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] points = new double[3][2];
        System.out.print("Enter 6 points:");
        for( int i =0 ; i < points.length; ++i){
            for( int j =0; j < points[0].length; ++j)
                points[i][j] = sc.nextDouble();
        }

        double[] answer = getRightmostLowestPoint(points);
        System.out.println("The lowermost point is ("+answer[0]+","+answer[1]+").");

        sc.close();
    }
}