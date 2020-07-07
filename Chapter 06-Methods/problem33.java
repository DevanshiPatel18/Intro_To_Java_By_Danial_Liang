public class problem33 {
    public static void getCurrentDateTime(){
        long millis = System.currentTimeMillis();
        long totalseconds = millis/1000;
        long currentseconds = totalseconds/60;
        long totalminutes = totalseconds%60;
        long currentminutes = totalminutes/60;
        long totalhours = totalminutes%60;
        long currenthours = totalhours/60;
        long totaldays = totalhours%24;
        long currentday = totaldays/24;
        long totalmonths = totaldays%12;
        long currentmonth = totalmonths%12;

        String month = getMonth(currentmonth);

        System.out.println("Current date and time is : "+month+" "+currentday+" "+currenthours+":"+currentminutes+":"+currentseconds);
    }

    public static String getMonth(long i){
        int j =(int)i;
        switch(j){
            case 0: return "December";
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
        }

        return "";
    }
    public static void main(String[] args) {
        getCurrentDateTime();       
    }
}