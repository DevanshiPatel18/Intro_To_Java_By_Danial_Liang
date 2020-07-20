package problem26;
import java.util.Scanner;
import java.io.File;

public class problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name od directory:");
        String dir = sc.nextLine();

        File file = new File(dir);

        if(file.mkdirs()){
            System.out.println("Directory successfully created !");
        }
        else
            System.out.println("Directory already exists!");
        sc.close();
    }
}