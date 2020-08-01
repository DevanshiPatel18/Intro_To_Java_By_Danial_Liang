package problem17;

import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first complex number: ");
        Complex complex1 = new Complex(sc.nextDouble(),sc.nextDouble());

        System.out.print("Enter the second complex number: ");
        Complex complex2 = new Complex(sc.nextDouble(),sc.nextDouble());

        System.out.println(complex1.toString() + " + " + complex2.toString() + " = " + complex1.add(complex2));
        System.out.println(complex1.toString() + " - " + complex2.toString() + " = " + complex1.subtract(complex2));
        System.out.println(complex1.toString() + " * " + complex2.toString() + " = " + complex1.multiply(complex2));
        System.out.println(complex1.toString() + " / " + complex2.toString() + " = " + complex1.division(complex2));
        System.out.println("|"+complex1.toString() + " + " + complex2.toString() + "| = " + complex1.abs());

    }
}