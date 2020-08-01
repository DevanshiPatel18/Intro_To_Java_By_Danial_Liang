package problem11;

public class problem11 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon o1 = new Octagon(5);
        
        System.out.println("Area: "+o1.getArea());
        System.out.println("Perimeter: "+o1.getPerimeter());
        
     
        Octagon o2 = (Octagon)o1.clone();
        System.out.println(o1.compareTo(o2));
       
    }
}