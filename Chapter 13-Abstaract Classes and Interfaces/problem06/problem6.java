package problem06;

public class problem6 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(10);

        if (circle1.compareTo(circle2) == 1)
            System.out.println("circle1 is larger");
        else if( circle1.compareTo(circle2) == -1)
            System.out.println("circle2 is larger");
        else
            System.out.println("Both are same");
        
    }
}