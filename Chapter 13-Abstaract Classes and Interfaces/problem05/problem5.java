package problem05;

public class problem5 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);

        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,4);

        System.out.println("circle1: "+circle1.toString());
        System.out.println("Circle2: "+circle2.toString());
        System.out.println("\nThe grater circle is: "+(Circle)GeometricObject.max(circle1, circle2));

        System.out.println("Rectangle1: "+rectangle1.toString());
        System.out.println("Rectangle2: "+rectangle2.toString());
        System.out.println("\nThe grater Rectangle is: "+(Rectangle)GeometricObject.max(rectangle1,rectangle2));
    }
}