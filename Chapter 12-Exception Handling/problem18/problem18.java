package problem18;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class problem18 {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: java problem18 srcRootDirectory");
            System.exit(0);
        }

        File file = new File(args[0]);

        File[] javaFileFolders = file.listFiles();

        for(int i =0; i < javaFileFolders.length; ++i){
            File temp = new File(javaFileFolders[i], "chapter"+(i+1)+".java");
            String s ="package chapter"+(i+1)+";\n";
            try (Scanner sc = new Scanner(temp)) {
                while(sc.hasNext()){
                    s += sc.nextLine() + "\n";
                }              
            } catch (Exception e) {
            }

            try (PrintWriter writer = new PrintWriter(temp)) {
                writer.print(s);
            } catch (Exception e) {
            }

        }

        System.out.println("Done!");
    }
}