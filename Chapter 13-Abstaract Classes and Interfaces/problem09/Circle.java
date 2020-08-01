package problem09;

public class Circle extends GeometricObject implements Comparable<Circle>{

    private double radius;

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        this.radius =  radius;
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
        return (2 * Math.PI * radius);
    }

    @Override
    public int compareTo(Circle o) {
        if (radius > o.radius)
            return 1;
        else if ( radius < o.radius)
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Circle))
            return false;
        return (compareTo((Circle)o) == 0);
    }

    @Override 
    public String toString(){
        return "Circle:\nradius: "+radius+" area: "+getArea()+" perimeter: "+getPerimeter();
    }
}