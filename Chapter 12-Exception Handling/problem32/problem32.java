package problem32;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class problem32 {
    public static void main(String[] args) throws Exception {
        System.out.println("Year    G1          G2          G3          G4          G5          B1          B2          B3          B4          B5");
        for (int i = 2010; i >= 2001; i--) {
          File babyNames = new File("babynameranking" + i + ".txt");
    
          if (!babyNames.exists()) {
            System.out.println("file " + babyNames.getName() + " doesn't exist");
            System.exit(1);
          }
    
          ArrayList<String> boyNames = new ArrayList<>();
          ArrayList<String> girlNames = new ArrayList<>();
    
          try (
            Scanner input = new Scanner(babyNames);
          ) {
            for (int j = 0; j < 5; j++) {
              input.next();
              boyNames.add(input.next());
              input.next();
              girlNames.add(input.next());
              input.next();
            }
          }catch(Exception e){

          }
    
          System.out.print(i + "    ");
          for (String g: girlNames) {
            System.out.printf("%-12s", g);
          }
          for (String b: boyNames) {
            System.out.printf("%-12s", b);
          }
          System.out.println();
        }
      }
}