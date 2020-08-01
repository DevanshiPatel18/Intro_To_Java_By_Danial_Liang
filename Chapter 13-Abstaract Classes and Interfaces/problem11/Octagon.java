package problem11;

public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
    private double side;

    public Octagon(){
        this(1.0);
    }

    public Octagon(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public double getArea(){
        return (2 * 4/(Math.sqrt(2)))*side*side;
    }

    public double getPerimeter(){
        return 8*side;
    }

    @Override
    public int compareTo(Octagon a){
        if(this.getArea() > a.getArea())
            return 1;
        else if(this.getArea() < a.getArea())
            return -1;

        return 0;
    }

    @Override
    public Octagon clone() throws CloneNotSupportedException{
        return (Octagon)super.clone();
    }
}