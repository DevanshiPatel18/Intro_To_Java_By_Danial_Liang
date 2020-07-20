package problem23;

import java.net.URL;
import java.util.Scanner;
public class problem23 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner sc = new Scanner(url.openStream());
            double sum =0.0;
            int count =0;
            double average = 0.0;
            while(sc.hasNextDouble()){
                count++;
                sum += sc.nextDouble();
            }
            average = sum/count;
            System.out.println("sum:"+sum+" average:"+average);
        } catch (Exception e) {
            System.out.println("Malformed URL. Try again!");
            System.exit(0);
        }

    }
}