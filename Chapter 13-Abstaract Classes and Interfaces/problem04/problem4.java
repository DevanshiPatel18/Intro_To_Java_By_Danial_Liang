package problem04;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintCalendar printCal = new PrintCalendar();
        GregorianCalendar myCal = new GregorianCalendar();

        int year = 0,month = 0 ;
        if(args.length == 2){
            month = Integer.parseInt(args[0]) - 1;
            year = Integer.parseInt(args[1]);
        }
        else if (args.length == 1){
            if (args[0].length() <= 2){
                month = Integer.parseInt(args[0]) - 1;
                year = myCal.get(Calendar.YEAR);
            }
            else{
                month = myCal.get(Calendar.MONTH);
                year = Integer.parseInt(args[0]);
            }
        }
        else if (args.length == 0){
            month = myCal.get(Calendar.MONTH);
            year = myCal.get(Calendar.YEAR);
        }
        else{
            System.out.println("Valid Usage: javac problem4 [month(0-12)] [year(");
        }
    
    myCal.set(year,month,1);

    printCal.printMonth(myCal);

    sc.close();
}
}