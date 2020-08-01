package problem07;

public class Square extends GeometricObject implements Colorable {
    
    private double side;

    public Square(){
        this(1.0);
    }

    public Square(double side){
        this.side = side;
    }

    public double getSide(double side){
        return side;
    }

    @Override
    public double getArea(){
        return side * side;  
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

    @Override
    public void howToColor(){
        System.out.println("Color all the four sides.");
    }

    @Override
    public String toString(){
        return "Square:\nside: "+ side + " area: "+ getArea() + " Perimeter: "+getPerimeter();
    }
}