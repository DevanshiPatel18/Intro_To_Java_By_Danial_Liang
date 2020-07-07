import java.util.Scanner;
public class problem36 {
    public static double area( int n, double side){

        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of sides:");
        double side = sc.nextDouble();

        System.out.println("The area of the polygon is: "+ area(n,side) );
    }
}