package problem28;
import java.io.File;
public class problem28 {
    public static void main(String[] args) {
        for (String s: args) {
          File file = new File(s);
          StringBuilder sb = new StringBuilder(s);
          if (s.matches("Exercise\\d_\\d+")) {
            sb.insert(8, "0");
          }
          File newName = new File(sb.toString());
          file.renameTo(newName);
        }
      }
}