package problem05;

public class Rectangle extends GeometricObject{
    private double width,height;

    public Rectangle(){
        this(1.0,1.0);
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return (width * height);
    }

    @Override
    public double getPerimeter(){
        return (2*(width + height));
    }

    @Override
    public String toString(){
        return "width: "+ width + " height: "+ height+" Area: "+getArea()+" Perimeter: "+getPerimeter();
    }
}