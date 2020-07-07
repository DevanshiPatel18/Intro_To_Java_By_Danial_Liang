package problem10;
import java.util.Scanner;
public class answer10 {
    public static void main(String[] args) {
        QuadraticEquation eqn = new QuadraticEquation();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();

        eqn.setA(a);
        eqn.setB(b);
        eqn.setC(c);
        System.out.println(eqn.getDiscriminant());
        if (eqn.getDiscriminant() > 0)
        System.out.println("The roots are : "+eqn.getRoot1()+" "+eqn.getRoot2());
        else{
            System.out.println("No real roots");
        }
        sc.close();
    }
}