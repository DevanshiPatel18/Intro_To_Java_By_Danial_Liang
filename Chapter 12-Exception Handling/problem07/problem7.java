package problem7;

import java.math.BigInteger;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary string:");
        String binaryString = sc.next();
        sc.close();
        try {
            for(int i =0; i < binaryString.length(); ++i){
                if (!(binaryString.charAt(i) == '0' || binaryString.charAt(i) == '1'))
                throw new NumberFormatException();
            }
        } catch (Exception e) {
            System.out.println("The string entered is not binary !");
            System.exit(0);
        }
        BigInteger sum = new BigInteger("0");
        //convert binary string to decimal
        for(int i =0; i < binaryString.length(); ++i){
            BigInteger num = new BigInteger(binaryString.charAt(i)+"");
            BigInteger pow = new BigInteger("2").pow(binaryString.length()-i-1);
            sum = sum.add(pow.multiply(num));
        }
        System.out.println("The decimal of binary number "+binaryString+" is "+sum.toString());
    }
}