package problem22;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class problem22 {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: java problem22 srcDirectory oldString newString");
            System.exit(0);
        }

        File directory = new File(args[0]);
        String oldString = args[1];
        String newString = args[2];

        if (!directory.exists()){
            System.out.println("This directory does not exist !");
            System.exit(1);
        }
        if( !directory.isDirectory()){
            System.out.println("This is not a directory");
            System.exit(2);
        }

        File[] files = directory.listFiles();
        for(int i =0; i < files.length; ++i){
            String s ="";
        try (Scanner sc = new Scanner(files[i])) {
            while(sc.hasNext()){
                s += sc.nextLine() + "\n";
            }
            s = s.replaceAll(oldString, newString);
        } catch (Exception e) {
        }
        try (PrintWriter writer = new PrintWriter(files[i])) {
           writer.print(s); 
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    System.out.println("Done");
    }
}