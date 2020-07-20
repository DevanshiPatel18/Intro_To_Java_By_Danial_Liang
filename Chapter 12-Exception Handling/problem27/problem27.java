package problem27;

import java.io.File;

public class problem27 {
    public static void main(String[] args) {
        for (String s: args) {
            File file = new File(s);
            StringBuilder sb = new StringBuilder(s);
            if (s.matches("Exercise\\d_\\d")) {
              sb.insert(8, "0");
              sb.insert(11, "0");
            } else if (s.matches("Exercise\\d_\\d+")) {
              sb.insert(8, "0");
            } else if (s.matches("Exercise\\d+_\\d")) {
              sb.insert(11, "0");
            }
            File newName = new File(sb.toString());
            file.renameTo(newName);
          }
        
    }
}