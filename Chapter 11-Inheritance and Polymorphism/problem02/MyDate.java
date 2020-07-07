package problem2;

import java.util.GregorianCalendar;

public class MyDate {
    private int year,month,day;

    public MyDate(){
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }
}