package problem19;

import java.math.BigInteger;

public class answer19 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("2");
        for(int i =2; i <=100; ++i){
             System.out.println(number.pow(i).subtract(new BigInteger("1")));
            
        }
    }
}