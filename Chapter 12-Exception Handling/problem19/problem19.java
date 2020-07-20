package problem19;


import java.net.URL;
import java.util.Scanner;
public class problem19 {
    public static void main(String[] args) {
        String urlString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
        long count = 0;
        try {
            URL url = new URL(urlString);
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext()){
                if(Character.isLetterOrDigit((sc.next()).charAt(0))){
                    ++count;
                }
            }
        } catch (Exception e) {
        }
        System.out.println("The number of words are: "+count);

    }
}