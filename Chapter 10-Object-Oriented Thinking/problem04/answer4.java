package problem4;

public class answer4 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10,30.5);
        System.out.println("Point1: x = "+point1.getX()+", y = "+point1.getY());
        System.out.println("Point2: x = "+point2.getX()+", y = "+point2.getY());
        System.out.println("The distance between them is form distance(MyPoint n) :"+point1.distance(point2));
        System.out.println("The distance between them is from distance(x,y) :"+point1.distance(point2.getX(),point2.getY()));
    }
}