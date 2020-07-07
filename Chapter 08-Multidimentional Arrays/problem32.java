import java.util.Scanner;
public class problem32 {
    public static double[] calculateSides(double[][] points) {
        double[] sides = new double[3];
        sides[0] = Math.sqrt(Math.pow(points[0][0]-points[1][0],2)+Math.pow(points[0][1]-points[1][1],2));
        sides[1] = Math.sqrt(Math.pow(points[1][0]-points[2][0],2)+Math.pow(points[1][1]-points[2][1],2));
        sides[2] = Math.sqrt(Math.pow(points[2][0]-points[0][0],2)+Math.pow(points[2][1]-points[0][1],2));
        return sides;
    }
    public static double getTriangleArea(double[][] points) {
        double[] sides = calculateSides(points);
        double s = (sides[0] + sides[1] + sides[2])/3;
        return Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));

    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] points = new double[3][2];
        System.out.print("Enter coordinates of 3 points:");
        for(int i =0 ; i < points.length; ++i){
            for(int j = 0 ; j < points[0].length; ++j)
                points[i][j] = sc.nextDouble();
        }
        System.out.print("the area of the triangle is:"+getTriangleArea(points));
   sc.close();
    }


}