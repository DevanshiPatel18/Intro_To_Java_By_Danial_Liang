package problem29;
import java.io.File;
public class problem29 {
    public static void main(String[] args) {
        for (String s: args) {
          File file = new File(s);
          StringBuilder sb = new StringBuilder(s);
          if (s.matches("Exercise\\d+_\\d")) {
              int index = s.indexOf("_");
            sb.insert(index+1, "0");
          }
          File newName = new File(sb.toString());
          file.renameTo(newName);
        }
      }
}