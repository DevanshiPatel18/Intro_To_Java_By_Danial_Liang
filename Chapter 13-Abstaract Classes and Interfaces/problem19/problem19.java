package problem19;

import problem15.Rational;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String num = sc.nextLine();
        
        String fractional = num.substring(num.indexOf(".")+1);
    
        BigDecimal num1 = new BigDecimal((Double.parseDouble(num)*(Math.pow(10,fractional.length()))+""));
        BigInteger numerator = num1.toBigInteger();
        BigDecimal deno  = new BigDecimal(Math.pow(10,fractional.length())+"");
        BigInteger denominator = deno.toBigInteger();
        
        Rational r = new Rational(numerator,denominator);

        System.out.println("the rational is: "+r.toString());

        sc.close();
    }    
}