import java.util.Scanner;
public class problem8 {
    public static double getDistance(double[] a, double[] b){
        double x = a[0] - b[0];
        double y = a[1] - b[1];

        double distance = Math.sqrt( x*x + y*y);

        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numOfPoints = sc.nextInt();

        double[][] points = new double[numOfPoints][2];

        for( int i =0; i < points.length; ++i){
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }

        double minDistance = getDistance(points[0],points[1]);
        
        // find min distance;

        for( int i =0; i < points.length -1; ++i){
            for( int j = i+1; j < points.length; ++j){
                double distance = getDistance(points[i],points[j]);
                if( distance < minDistance){
                    minDistance = distance;
                }
            }
        }
        System.out.println(minDistance);
        //find points with same min distance

        for( int i =0; i < points.length -1; ++i){
            for( int j = i+1; j < points.length; ++j ){
                double distance = getDistance(points[i],points[j]);
                if( distance == minDistance)
                    System.out.println("The closet teo points are "+java.util.Arrays.toString(points[i])+" and "+java.util.Arrays.toString(points[j]));
            }
        }

        System.out.println("The minimum distance is "+minDistance);
    sc.close();
    }
}