package problem16;

import java.math.BigInteger;
import problem14.Rational;

public class problem16 {
    public static void main(String[] args) {
        System.out.println(args.length);
        if (args.length != 1){
            System.out.println("Usage: javac problem16 \"rational1 operator rational2\"");
            System.exit(0);
        }

        String[] expression = args[0].split("\\s+");  //splits the regex from one or some white spaces
        String[] r1 = expression[0].split("/");
        String[] r2 = expression[2].split("/");
        String operator = expression[1];

        Rational rational1 = new Rational(Long.parseLong(r1[0]), Long.parseLong(r1[1]));
        Rational rational2 = new Rational(Long.parseLong(r2[0]), Long.parseLong(r2[1]));

        String result = rational1+" " + operator + " " + rational2 + " = ";

        switch(operator){
            
            case "+": result += rational1.add(rational2) ;
                break;
            case "-": result += rational1.subtract(rational2);
                break;
            case "/": result += rational1.divide(rational2);
                break;
            case "*": result += rational1.multiply(rational2);
                break;
        }
        
        System.out.println(result);

    }    
}