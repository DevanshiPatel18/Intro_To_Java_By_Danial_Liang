import java.util.Scanner;
public class problem31 {
    public static double[] getIntersectionPoint(double[][] lineConstants){
        double[] answer = new double[3];
        double determinant = lineConstants[0][0]*lineConstants[1][1] - lineConstants[1][0]*lineConstants[0][1];
        if (determinant == 0.0)
           return answer;
        else{
            answer[0] = (lineConstants[0][2]*lineConstants[1][1] - lineConstants[1][2]*lineConstants[0][1])/determinant;
            answer[1] = (lineConstants[0][0]*lineConstants[1][2] - lineConstants[1][0]*lineConstants[0][2])/determinant;
            answer[2]= 10001;
            return answer;
        }
        
    }
    public static double[][] getLines(double[][] points) {
        double[][] lineConstants = new double[2][3];
        double slope1 = (points[0][0] - points[1][0])/(points[0][1]-points[1][1]);
        double slope2 = (points[2][0] - points[3][0])/(points[2][1]-points[3][1]);
        lineConstants[0][2] = points[0][1]-slope1*points[0][0];
        lineConstants[1][2] = points[1][1]-slope1*points[1][0];
        lineConstants[0][0] = slope1;
        lineConstants[1][0] = slope2;
        lineConstants[0][1] = 1;
        lineConstants[1][0] =1;

        return lineConstants;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] points = new double[4][2];

        System.out.print("Enter points on line 1 and 2:");
        for(int i= 0; i < points.length;++i){
            for( int j =0 ; j  <points[0].length; ++j){
                points[i][j] = sc.nextDouble();
            }
        }
        double[][] lineConstants = getLines(points);
        double[] IntersectionPoint = getIntersectionPoint(lineConstants);
        if(IntersectionPoint[2]== 10001){
        System.out.print("The intersection point is ("+IntersectionPoint[0]+","+IntersectionPoint[1]+").");
    }
    else
        System.out.println("Not intersecting lines");    
    sc.close();
    }
}