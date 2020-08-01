package problem14;

public class problem14 {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);

        System.out.println("r1.add(r2): " + r1.add(r2));
        System.out.println("r1.subtract(r2): " + r1.subtract(r2));
        System.out.println("r1.multiply(r2): " + r1.multiply(r2));
        System.out.println("r1.divide(r2): " + r1.divide(r2));
    
    }
}