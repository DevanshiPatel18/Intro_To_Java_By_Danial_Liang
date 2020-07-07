package problem18;

import java.math.BigInteger;

public class answer18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE+"");
        for(int i =0; i < 5; ++i){
            System.out.println(number.nextProbablePrime());
            number = number.nextProbablePrime();
        }
    }
}