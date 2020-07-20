package problem13;

import java.io.File;
import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        if (args.length != 1 ){
            System.out.println("Usage: java problem13 [filename]");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("File does not exist !");
            System.exit(1);
        }
        System.out.println("0");
        int words =0,lines=0;
        String s ="";
        try (Scanner sc = new Scanner(file)) {

            while(sc.hasNext()){
                words++;
                s += sc.next();
            }
        } catch (Exception e) {
        }
        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNext()){
                sc.nextLine();
                lines++;
            }
        } catch (Exception e) {
        }
        System.out.println("The no of lines are:"+lines);
        System.out.println("The no of characters are :"+s.length());
        System.out.println("The no of words are: "+ words);
    }
}