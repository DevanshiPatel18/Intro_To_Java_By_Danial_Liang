package problem05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides:");
        try{
        Triangle triangle = new Triangle(sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
        System.out.println(triangle.toString()+"\nArea:"+triangle.getArea()+"\nPerimeter: "+triangle.getPerimeter());
    }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
        catch(IllegalTriangleException e){
            System.out.println("Sum of two sides greater than 3rd side property not satisfied");
        }
        sc.close();
    }
}