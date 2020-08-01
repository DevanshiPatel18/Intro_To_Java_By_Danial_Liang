package problem05;

public class Circle extends GeometricObject{
    
    private double radius;

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return (Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter(){
        return ( 2 * Math.PI * radius);
    }

    @Override
    public String toString(){
        return "Radius: "+getRadius()+" Area: "+getArea()+" Perimeter: "+getPerimeter();
    }


}