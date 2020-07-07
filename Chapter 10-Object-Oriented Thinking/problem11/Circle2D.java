package problem11;

public class Circle2D {
    private double x,y;
    private double radius;
    private double getX(){
        return x;
    }

    private double getY(){
        return y;
    }

    private double getRadius(){
        return radius;
    }

    public Circle2D(){
        this(0,0,1);
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPrimeter(){
        return 2*Math.PI*radius;
    }

    public boolean contains(double x, double y){
        double x1 = this.x - x;
        double y1 = this.y - y;

        return (distance(x1,y1) < radius ? true : false);

    }

    public boolean contains(Circle2D circle){
        
        return ( this.radius > distance(this.x-circle.getX(),this.y-circle.getY()) + circle.getRadius() ? true: false);
    }

    public boolean overlaps(Circle2D circle){
        return (distance(this.x - circle.getX(),this.y - circle.getY() )< this.radius + circle.getRadius() ? true : false);
    }

    public double distance(double x1,double y1){
        return Math.sqrt(x1*x1 + y1*y1);
        }
}