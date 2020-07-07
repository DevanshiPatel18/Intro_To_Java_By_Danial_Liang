package problem11;

public class answer11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("Area : "+c1.getArea());
        System.out.println("Perimeter :" + c1.getPrimeter());
        System.out.println(c1.contains(new Circle2D(4,5,10.5)));
        System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
    }
}