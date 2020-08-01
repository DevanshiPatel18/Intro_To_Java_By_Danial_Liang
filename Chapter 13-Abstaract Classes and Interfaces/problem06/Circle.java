package problem06;

public class Circle{
    
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

   
    public double getArea(){
        return (Math.PI * radius * radius);
    }

    public double getPerimeter(){
        return ( 2 * Math.PI * radius);
    }

    @Override
    public String toString(){
        return "Radius: "+getRadius()+" Area: "+getArea()+" Perimeter: "+getPerimeter();
    }


}