package problem4;

import java.util.Random;
public class answer4 {
    public static void main(String[] args) {
        Random myRandom = new Random(1000);
        for(int i =1; i <= 50; ++i)
            System.out.println(myRandom.nextInt(100));

    }
}