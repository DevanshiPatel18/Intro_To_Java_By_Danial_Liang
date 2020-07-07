package problem1;

import java.util.Scanner;



public class answer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 sides of the triangle:");
        Triangle myTriangle = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        System.out.println("Enter color:");
        String color = sc.next();
        myTriangle.setColor(color);

        System.out.println("Triangle filled or not:");
        myTriangle.setFilled(sc.nextBoolean());

        System.out.println("Area :" + myTriangle.getArea()+" Perimeter: "+ myTriangle.getPerimeter()+" color: "+ myTriangle.getColor());
        System.out.println(myTriangle.toString());
    
        sc.close();
    }
}