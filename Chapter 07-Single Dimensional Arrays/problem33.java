import java.util.Scanner;
public class problem33 {
    public static String chineseZodiac(int year){
        String[] zodiac = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};

        return zodiac[year%12];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println(chineseZodiac(year));
        sc.close();
    }
}