package problem21;

import java.io.File;
import java.util.Scanner;

public class problem21 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java problem21 srcFile");
            System.exit(0);
        }

        File file = new File(args[0]);
        if(!file.exists()){
            System.out.println("This file does not exist !");
            System.exit(1);
        }
        if (!file.isFile()){
            System.out.println("The file you mentioned is not a file" );
            System.exit(2);
        }

        try (Scanner sc = new Scanner(file) ){
            String previous = sc.next();
            while(sc.hasNext()){
                String current = sc.next();
                if(!(previous.compareTo(current) <= 0)){
                    System.out.println("The strings in the file are not sorted !");
                    System.out.println("The first two unsorted strings are:"+previous+" and "+current);
                    System.exit(4);
                }
                previous = current;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("The strings in the tet file are sorted");
    }
}