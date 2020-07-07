import java.util.Scanner;
public class problem21 {
    public static double findDistance(double[] location1,double[] location2) {
        double x = location1[0] - location2[0];
        double y = location1[1] - location2[1];
        return Math.sqrt( x*x + y*y);
    }
    public static double sumOfDistances(double[][] points,double[] location) {
        double sumOfDistance = 0;

            for( int i =0 ; i < points.length; ++i){
                if (location == points[i])
                    continue;
                sumOfDistance +=  findDistance(location,points[i]);
            }

        return sumOfDistance;
        
    }
    public static double[] shortestSumofDistances(double[][] points) {
        double[] result = new double[3];
        //initializing the  result
       result[0] = points[0][0];
       result[1] = points[0][1];
       result[2] = sumOfDistances(points,points[0]);

       //finding the shortetest
       for( int i =0 ; i < points.length; ++i){
        double temp = sumOfDistances(points,points[i]);
        if ( temp < result[2]){
            result[0] = points[i][0];
            result[1] = points[i][1];
            result[2] = temp;
        }       
    }
    return result;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of cities:");
        int cities = sc.nextInt();

        double[][] points = new double[cities][2];

        System.out.print("Enter the coordinates:");
        for( int i = 0; i < points.length; ++i ){
            for( int j = 0; j  < points[0].length; ++j){
                points[i][j] = sc.nextDouble();
            }
        }

        double[] result = shortestSumofDistances(points);

        System.out.println("The central city is at: ("+result[0]+", "+result[1]+")");
        System.out.printf("The total distance to all the other cities is %.2f",result[2]);
    }

    
}