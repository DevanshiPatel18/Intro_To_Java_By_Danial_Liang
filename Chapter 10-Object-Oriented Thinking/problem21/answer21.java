package problem21;

import java.math.BigInteger;

public class answer21 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE+"");
        int count = 0;
        while(count != 10){
            if ((number.remainder(new BigInteger("3")).compareTo(new BigInteger("0"))) ==0 || (number.remainder(new BigInteger("5")).compareTo(new BigInteger("0"))) == 0){
                System.out.println(number.toString());
                count++;
            }
            number = number.add(BigInteger.ONE);

        }
    }
}