import java.util.Scanner;
public class problem35 {
    public static double area(double side){

        return (5*side*side)/(4*Math.tan(Math.PI/5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the side:");
        System.out.println("The area of the pentagon is: "+area(sc.nextDouble()));
    }
}