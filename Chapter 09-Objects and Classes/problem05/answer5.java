package problem5;

import java.util.GregorianCalendar;
public class answer5 {
    public static void main(String[] args) {
        GregorianCalendar myCal = new GregorianCalendar();
        System.out.println("The current year is:"+myCal.get(GregorianCalendar.YEAR));
        System.out.println("The current month is:"+myCal.get(GregorianCalendar.MONTH));
        System.out.println("The current date is:"+myCal.get(GregorianCalendar.DAY_OF_MONTH));

        myCal.setTimeInMillis(1234567898765L);
        System.out.println("The current year is:"+myCal.get(GregorianCalendar.YEAR));
        System.out.println("The current month is:"+myCal.get(GregorianCalendar.MONTH));
        System.out.println("The current date is:"+myCal.get(GregorianCalendar.DAY_OF_MONTH));

    }
}