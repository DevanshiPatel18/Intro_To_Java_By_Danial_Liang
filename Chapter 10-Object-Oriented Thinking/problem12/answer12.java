package problem12;
import problem4.MyPoint;
public class answer12 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5));
        System.out.println("Area: "+t1.getArea());
        System.out.println("Perimeter : "+t1.getPerimeter());
        System.out.println(t1.contains(new MyPoint(3,3))+" "+t1.contains(new Triangle(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4))));
        t1.overlaps(new Triangle(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5)));
        
    }
}