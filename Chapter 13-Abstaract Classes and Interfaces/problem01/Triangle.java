package problem01;

public class Triangle extends GeometricObject{
    
    double side1,side2,side3;

    public Triangle(){
        this(1.0,1.0,1.0);
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea(){
        double side = (side1 + side2 + side3)/2;
        return Math.sqrt(side*(side - side1)*(side - side2)*(side - side3));
    }

    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return "Triangle:\nside1: "+ side1 + "\nside2: " + side2 + "\nside3: " + side3;
    }
}