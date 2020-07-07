import java.util.*;

public class problem31 {
    
    public static boolean isValid( long number){
        
        return ( number % 10 ==0 ? true : false );
    }

    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
       String num = Long.toString(number);
        for ( int i =0; i < num.length(); i=i+1){
            if ((long)(num.charAt(i))*2 > 9){
                sum += getDigit((int)(num.charAt(i))*2);
            }
            else    
                sum += num.charAt(i)*2;
        }

        return sum;
    }

    public static int getDigit(int number){

        return ( number > 9 ? (number/10+number%10) : number);

    }

    public static int sumofOddPlace(long number){
       String num = Long.toString(number);
        int sum = 0;

        for(int i = 1; i < num.length(); i=i+1){
            sum += (int)(num.charAt(i));
        }

        return sum;
    }

    public static boolean prefixMatched(long number, int d){

        return (Long.toString(number).startsWith(Integer.toString(d)) ? true:false);
    }

    public static int getSize(long d){

        return Long.toString(d).length();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter card number:");
        long number = sc.nextLong();

        int sumodd = sumofOddPlace(number);
        int sumeven = sumOfDoubleEvenPlace(number);

        if (isValid(sumodd + sumeven))
            System.out.println("It is valid !!");
        else
            System.out.println("It is not valid !!");
    }
}