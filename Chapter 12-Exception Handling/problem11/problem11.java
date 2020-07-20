package problem11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        String name = args[0];

        if (args.length != 2) {
            System.out.println("Usage: java E12_11 " +
              "[string to remove from file] [file name]");
            System.exit(1);
          }
      
          File file = new File(args[1]);
      
          if (!file.exists()) {
            System.out.println("No file " + args[1] + " was found.");
            System.exit(2);
          }
      
        String s = "";
        try ( 
            Scanner sc = new Scanner(file);
         ) {
            while(sc.hasNext()){
                s += sc.nextLine()+"\n";
            }
            s = s.replaceAll(name, "");
         }
         catch(Exception ne){

         }   
         try ( 
           PrintWriter print = new PrintWriter(file);
         ) {
            print.print(s);
         }
         catch(Exception ne){

         }      
        }
    }
    
