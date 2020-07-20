package problem20;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: java problem20 srcRootDirectory");
            System.exit(0);
        }

        File file = new File(args[0]);

        if (!file.exists()){
            System.out.println("This source file does not exist !");
            System.exit(0);
        }

        if (!file.isDirectory()){
            System.out.println("This source file is not a directory .");
            System.exit(0);
        }

        File[] files = file.listFiles();
        System.out.println(java.util.Arrays.toString(files));
        for(int i =0; i < files.length; ++i){
            String s ="";
            File[] targetFiles = files[i].listFiles();
            System.out.println(java.util.Arrays.toString(targetFiles));
            for(int j =0; j < targetFiles.length; ++j){
        try (Scanner sc = new Scanner(targetFiles[j]);){
            if(targetFiles[j].getName().endsWith(".java")){
                
                while(sc.hasNext()){
                    s += sc.nextLine() +"\n";
                    System.out.println(s);
                }
                System.out.println(s);
                String temp = "package chapter"+(j+1)+";";
                s = s.replaceAll(temp," ");
                System.out.println(s);
            
            }

            try (PrintWriter writer = new PrintWriter(targetFiles[i])) {
                writer.print(s);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        catch (Exception e) {
           
        }
        System.out.println("Done !");
     } 
    }
    }
}