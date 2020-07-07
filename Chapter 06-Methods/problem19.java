import java.util.Scanner;

public class problem19 {
    public static boolean isValid(double s1, double s2, double s3){

        return ((s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2)) ;

    }

    public static double area(double s1, double s2, double s3){

        double s = (s1 + s2 + s3)/2;

        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides of triangle: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        
        if ( isValid(s1 ,s2 ,s3 ))
            System.out.printf("The area is: %3.1f",area(s1,s2,s3));
        else
            System.out.println("The sides are invalid");
    }
}