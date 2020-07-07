import java.util.Scanner;
public class problem34 {
    public static String sort(String s) {
        char[] array = s.toCharArray();
        java.util.Arrays.sort(array);
        String sortedS = ""; 
        for( int i=0; i < array.length; ++i)
            sortedS += array[i]+"";
        
        return sortedS;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter String:");
            String s = sc.next();

            System.out.println(sort(s));

            sc.close();
        }

}