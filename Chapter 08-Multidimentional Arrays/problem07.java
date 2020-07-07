public class problem7 {
    public static double getDistance(double[] a ,double[] b){
            double x = a[0] - b[0];
            double y = a[1] - b[1];
            double z = a[2] - b[2];

            double distance = Math.sqrt(x*x + y*y + z*z);

            return distance;
    }

    public static void main(String[] args) {
    double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
            {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
            {5.5, 4, -0.5}};

        double minDistance =getDistance(points[0],points[1]);
        double[] point1 = points[0];
        double[] point2 = points[1];
    for( int i =0; i < points.length -1 ; ++i){
        for( int j =i+1; j < points.length; ++j){
            double distance = getDistance(points[i], points[j]);
            if(distance < minDistance){
                minDistance = distance;
                point1 = points[i];
                point2 = points[j]; 
            }
        }
    }

    System.out.println("The smallest distance is "+minDistance+" between "+java.util.Arrays.toString(point1)+" and "+java.util.Arrays.toString(point2));
    }
}