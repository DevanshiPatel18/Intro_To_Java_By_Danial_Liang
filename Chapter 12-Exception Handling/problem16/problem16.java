package problem16;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class problem16{
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage : java problem16 file oolString newString");
            System.exit(0);
        }

    File file = new File(args[0]);
    if (!file.exists()){
        System.out.println("File does not exist !");
        System.exit(0);
    }
    if ( file.length() == 0){
        System.out.println("The file is empty !");
        System.exit(1);
    }

    String s = "";
    try (Scanner sc = new Scanner(file)) {
        while(sc.hasNext()){
            s += (sc.nextLine()+"\n").replaceAll(args[1], args[2]);
        }
    } catch (Exception e) {
        
    }

    try (PrintWriter writer = new PrintWriter(file)) {
        writer.print(s);
    } catch (Exception e) {
        //TODO: handle exception
    }
    }
}