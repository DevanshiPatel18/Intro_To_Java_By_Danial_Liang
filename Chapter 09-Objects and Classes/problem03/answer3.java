package problem3;

import java.util.Date;

public class answer3 {
    public static void main(String[] args) {
        long elapsedTime = 10000;
        Date myDate = new Date();
        for(int i =1; i <= 8; ++i){
            myDate.setTime(elapsedTime);
            System.out.println(myDate.toString());
            elapsedTime *= 10;

        }    
    }
   
}