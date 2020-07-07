package problem11;

import java.util.Scanner;


public class answer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        double a = sc.nextDouble();
        System.out.print("Enter b:");
        double b = sc.nextDouble();
        System.out.print("Enter c:");
        double c= sc.nextDouble();
        System.out.print("Enter d:");
        double d = sc.nextDouble();
        System.out.print("Enter e:");
        double e = sc.nextDouble();
        System.out.print("Enter f:");
        double f = sc.nextDouble();
           
        LinearEquation eqn = new LinearEquation(a, b, c, d, e, f);

        if(eqn.isSolvable())
            System.out.println("X: "+eqn.getX()+" Y : "+eqn.getY());
        else
            System.out.println("Not solvable");
            sc.close();

        }

}