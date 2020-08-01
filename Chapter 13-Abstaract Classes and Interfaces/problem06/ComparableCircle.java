package problem06;

public class ComparableCircle extends Circle implements Comparable<Circle>{
    
    public ComparableCircle(){
        super();
    }

    public ComparableCircle(double radius){
        super(radius);
    }
    
    public int compareTo(Circle a){
        if (getArea() > a.getArea())
            return 1;
        else if (getArea() < a.getArea())
            return -1;
        else 
            return 0;
    }
}