package problem05;
import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    public static GeometricObject max(GeometricObject a, GeometricObject b){
        if ( a.compareTo(b) == -1)
            return b;
        
            return a;
    }

    @Override
    public String toString(){
        return "created on "+ dateCreated +"\ncolor: " + color + "\nfilled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject c){
        if (getArea() > c.getArea())
           return 1;
        else if (getArea() < c.getArea())
            return -1;
        else 
            return 0;
       
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}