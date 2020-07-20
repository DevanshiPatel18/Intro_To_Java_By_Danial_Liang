package problem24;

import java.io.File;
import java.io.PrintWriter;

public class problem24 {
    public static void main(String[] args) {
        File file = new File("c:/users/pdevs/desktop/Salary.txt");

        if (file.exists()) {
          System.out.println("File " + file.getName() + " already exists");
          System.exit(1);
        }
    
        String[] ranks = {"assistant", "associate", "full"};
    
        try (
          PrintWriter output = new PrintWriter(file);
        ) {
          for (int i = 1; i <= 1000; i++) {
            int rank = (int)(Math.random() * ranks.length);
            double salary = getSalary(rank);
            output.printf("FirstName%d LastName%d %s %.2f\n",
              i, i, ranks[rank], salary);
          }
        }catch(Exception s){}
      }
    
      public static double getSalary(int rank) {
        double salary = 0.0;
        switch (rank) {
          case 0: salary = (Math.random() * 30_000) + 50_000; break;
          case 1: salary = (Math.random() * 50_000) + 60_000; break;
          case 2: salary = (Math.random() * 55_000) + 75_000;
        }
        return salary;
      }
    }
