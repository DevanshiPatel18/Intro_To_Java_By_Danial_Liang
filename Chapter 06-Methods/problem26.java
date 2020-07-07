public class problem26 {
    
    public static boolean palindrome(long num){
        long temp=0;
        long original = num;
            while (num > 0){
            int s =(int)(num % 10);
            temp = temp*10 +s;
            num /=10;
        }

        if (temp == original) 
            return true;
        else
            return false;
    }

    public static boolean prime(long num){

        for (int i = 2; i <= Math.sqrt(num); ++i){

            if(num % i ==0)
                return false;
        }

        return true;
    }

    public static void main(String[] args){
        int count=0;
        final int MAX_IN_ONE_LINE = 10;
        for ( int i = 2 ;  ; ++i ) {

            if (palindrome(i) && prime(i)){
                ++count;
                if (count%MAX_IN_ONE_LINE == 0)
                    System.out.printf("%7d\n",i);
                else
                    System.out.printf("%7d ",i);

                if (count == 100)
                    break;
            }
        }
    }
}