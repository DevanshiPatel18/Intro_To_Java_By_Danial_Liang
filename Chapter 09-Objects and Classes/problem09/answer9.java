package problem9;

public class answer9 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1:");
        System.out.println("No. of Sides: "+polygon1.getSide()+" Length of side: "+polygon1.getSideLength()+" X-"+polygon1.getX()+" Y-"+polygon1.getY());
        System.out.println("Area: "+polygon1.getArea());
        System.out.println("Perimeter: "+polygon1.getPerimeter());
   
        System.out.println("Polygon 2:");
        System.out.println("No. of Sides: "+polygon2.getSide()+" Length of side: "+polygon2.getSideLength()+" X-"+polygon2.getX()+" Y-"+polygon2.getY());
        System.out.println("Area: "+polygon2.getArea());
        System.out.println("Perimeter: "+polygon2.getPerimeter());

        System.out.println("Polygon 3:");
        System.out.println("No. of Sides: "+polygon3.getSide()+" Length of side: "+polygon3.getSideLength()+" X-"+polygon3.getX()+" Y-"+polygon1.getY());
        System.out.println("Area: "+polygon3.getArea());
        System.out.println("Perimeter: "+polygon3.getPerimeter());
    }
}