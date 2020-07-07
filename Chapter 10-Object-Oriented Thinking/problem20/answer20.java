package problem20;

import java.math.BigDecimal;
import java.math.MathContext;

public class answer20{
    public static BigDecimal fact(int val){
        BigDecimal number = BigDecimal.ONE;
        for(int i = 2; i <= val; ++i){
            number = number.multiply(new BigDecimal(i),new MathContext(9));
        }
        return number;
    }
    public static BigDecimal getEValue(int val){
        BigDecimal number=BigDecimal.ONE;
        BigDecimal ONE = new BigDecimal(1);
        for(int i = 1; i <= val; ++i){
            number = number.add(ONE.divide(fact(i),new MathContext(9)),new MathContext(150));
        }
        return number;
    }
    public static void main(String[] args) {
        int i =100;
        while( i <= 1000){
            System.out.println(getEValue(i));
            i += 100;
        }
    }
} 