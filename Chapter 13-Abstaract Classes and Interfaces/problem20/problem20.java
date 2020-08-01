package problem20;

import java.util.Scanner;

import problem17.Complex;

public class problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d =(b * b )- (4*a*c);

        if ( d >= 0){
            double root1 = (-b + Math.sqrt(d))/(2*a);
            if ( d == 0 ){
                System.out.println("The root is : "+root1);
                System.exit(0);
            }
            double root2 = (-b - Math.sqrt(d))/(2*a);

            System.out.println("The roots are: "+root1 +" "+root2);
        }else{
            Complex root1  = new Complex(0,Math.sqrt(Math.abs(d)));
            Complex root2 = new Complex(0,Math.sqrt(Math.abs(d)));

            root1 = ((new Complex(-b)).add(root1)).division(new Complex(2*a));
            root2 = ((new Complex(-b)).subtract(root2)).division(new Complex(2*a));

            System.out.println("The roots are: "+ root1 + " "+ root2);
        }
        sc.close();
    }
}