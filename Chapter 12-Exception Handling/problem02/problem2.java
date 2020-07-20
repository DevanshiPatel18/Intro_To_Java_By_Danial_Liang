package problem02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter two integers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+" + "+b+" = "+(a+b));                
            } catch (InputMismatchException e) {
                sc.reset();
                continue;
            }
            sc.close();
            break;
        } while (true);
    }
}