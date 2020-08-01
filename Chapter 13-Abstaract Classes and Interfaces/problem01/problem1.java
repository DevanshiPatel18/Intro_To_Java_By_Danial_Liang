package problem01;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.print("Enter a filled value (T/F): ");
        String fillString = input.next();
        boolean filled = false;
        if (fillString.toLowerCase().equals("t")) {
          filled = true;
        } else if (fillString.toLowerCase().equals("f")) {
          filled = false;
        } else {
          System.out.println("Invalid entry: must enter T or F.");
          System.exit(1);
        }
    
        Triangle t = new Triangle(s1, s2, s3);
        t.setColor(color);
        t.setFilled(filled);
    
        System.out.println("area: " + t.getArea());
        System.out.println("perimeter: " + t.getPerimeter());
        System.out.println("color: " + t.getColor());
        System.out.println("filled: " + t.isFilled());
        
        input.close();
    }
}