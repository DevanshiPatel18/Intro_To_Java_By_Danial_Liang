package problem10;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
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
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle))
            return false;
        return (compareTo((Rectangle)(obj)) == 0);     
    }

    @Override
    public String toString(){
        return "width: "+ width + " height: "+ height+" Area: "+getArea()+" Perimeter: "+getPerimeter();
    }
}