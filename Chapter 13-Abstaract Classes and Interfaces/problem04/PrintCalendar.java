package problem04;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PrintCalendar {
    public void printMonth(GregorianCalendar g){
        printMonthTitle(g);
        printMonthBody(g);
    }

    public void printMonthTitle(GregorianCalendar g){
       String monthString = g.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
       System.out.println("\t"+monthString+" "+g.get(Calendar.YEAR));
       System.out.println("-------------------------------");
       System.out.println(" Sun Mon Tue Wed Thr Fri Sat"); 
    }

    public void printMonthBody(GregorianCalendar g){
        int startDay = getStartDay(g);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(g);
        int i;
        for(i = 0; i < startDay; ++i){
            System.out.printf("%4s"," ");
        }

        for(i =1; i <= numberOfDaysInMonth; ++i){
            System.out.printf("%4d",i);
            if ((i+startDay)%7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public int getStartDay(GregorianCalendar g){
        return g.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public int getNumberOfDaysInMonth(GregorianCalendar g){
        int month = g.get(Calendar.MONTH);
        
        if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11)
            return 31;
        if(month == 3 || month == 5  || month == 8 || month ==10)
            return 30;
        
        return (g.isLeapYear(Calendar.YEAR) ? 29 : 28);
    }
}