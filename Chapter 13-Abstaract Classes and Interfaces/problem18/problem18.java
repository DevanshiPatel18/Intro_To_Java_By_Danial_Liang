package problem18;

import problem14.Rational;

public class problem18 {
    public static void main(String[] args) {
        double sum = 0.0;
        for(int i = 1; i<=99;){
            sum += (new Rational(i,++i)).doubleValue();
        }

        System.out.print(sum);
    }    
}