import java.util.Scanner;

public class problem25 {
    
    public static String convertMillis(long millis){


        long seconds = millis/1000;
        long totalminutes = seconds/60;
        long totalhours = totalminutes/60;
        long days = totalhours/24;

        return (totalhours%24+":"+totalminutes%60+":"+seconds%60);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        long seconds = sc.nextLong();
        System.out.println(""+convertMillis(seconds));

        sc.close();
    }

}