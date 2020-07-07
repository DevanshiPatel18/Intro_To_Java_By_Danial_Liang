package problem8;

public class answer8 {
    public static void main(String[] args) {
        final int FAST =3;
        final int MEDIUM = 2;
        final int SLOW = 1;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.color = "Yellow";
        fan1.setOn(true);

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.color = "Blue";
        fan2.setOn(false);
       
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}