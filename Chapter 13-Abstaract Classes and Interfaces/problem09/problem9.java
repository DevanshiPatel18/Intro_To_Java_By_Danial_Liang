package problem09;

public class problem9 {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(1);

        System.out.println("c1.equals(c2) ? "+c1.equals(c2));
        System.out.println("c2.equals(c3) ? "+c2.equals(c3));
        System.out.println("c3.equals(c1) ? "+c3.equals(c1));
        

    }
}