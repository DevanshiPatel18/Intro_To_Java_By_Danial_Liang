package problem10;

public class problem10 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle();

        System.out.println("r1.equals(r2) ? "+r1.equals(r2));
        System.out.println("r2.equals(r3) ? "+r2.equals(r3));
        System.out.println("r3.equals(r1) ? "+r3.equals(r1));

    }
}