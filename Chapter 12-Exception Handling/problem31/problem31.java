package problem31;

import java.util.Scanner;
import java.io.File;

public class problem31 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String year = userInput.nextLine();
        System.out.print("Enter the gender: ");
        String gender = userInput.nextLine().toLowerCase();
        System.out.print("Enter the name: ");
        String name = userInput.nextLine();
    
        File babyNames = new File("babynameranking" + year + ".txt");
    
        // check whether the file exists
        if (!babyNames.exists()) {
          System.out.println("No file for " + year + " was found");
          System.exit(1);
        }
    
        try (
          Scanner fileInput = new Scanner(babyNames);
        ) {
          while (fileInput.hasNext()) {
            String rank = fileInput.next();
            String mName = fileInput.next().toLowerCase();
            String mBirths = fileInput.next();
            String fName = fileInput.next().toLowerCase();
            String fBirths = fileInput.next();
            if ((gender.equals("m") && mName.equals(name.toLowerCase())) ||
                (gender.equals("f") && fName.equals(name.toLowerCase()))) {
              System.out.println(name + " is ranked #" + rank + " in year " + year);
              System.exit(0);
            }
          }
          System.out.println("The name " + name + " is not ranked in year "
            + year);
        }catch(Exception e){}
        userInput.close();
    }
}