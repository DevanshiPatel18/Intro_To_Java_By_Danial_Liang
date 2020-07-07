package problem16;

import java.math.BigInteger;

public class answer16 {
    public static void main(String[] args) {
        
        int count =0;
        String num = "1";
        for(int i =0; i <= 49;++i){
            num += "0";
        }
        BigInteger number = new BigInteger(num);
        BigInteger zero = new BigInteger("0");

        while(count != 10){
            if ( zero.compareTo(number.remainder(new BigInteger("2"))) == 0 || zero.compareTo(number.remainder(new BigInteger("3"))) == 0){
                System.out.println(number.toString());
                count++;
            }
            
            number = number.add(new BigInteger("1"));
        }

    }
}