package problem14;
import java.io.File;
import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        
        if (args.length != 1){
            System.out.println("Usage: java problem14 [filename]");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (! file.exists() ){
            System.out.println("This file does not exist");
            System.exit(1);
        }
        double sum =0;
        double average = 0.0;
        int elements =0;
        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNext()){
                elements++;
                sum += sc.nextDouble();
            }
            average = sum/elements;
        } catch (Exception e) {
        }    
        System.out.println("Sum: "+sum+" Average: "+average);

    }
}