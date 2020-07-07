public class problem27 {

    public static long reverse(long num){

        int temp =0;

        while(num > 0){
            int s = (int)num % 10;
            temp = temp*10 + s;
            num /= 10;
        }

        return temp;
    }

    public static boolean prime(long num){

        for( int i =2; i <= Math.sqrt(num); ++i){
            if( num % i ==0 )
                return false;
        }

        return true;
    }
    public static boolean nonpalindrome(long num){
        
            return ( num == reverse(num) ? false : true) ;    
    }
    public static void main(String[] args) {
        int count = 0;
        final int MAX_IN_ONE_LINE = 10;
        for( int i = 12; ; ++i){
            if ( prime(i) && prime(reverse(i)) && nonpalindrome(i) ){
                ++count;
                if ( count % MAX_IN_ONE_LINE == 0)
                    System.out.printf("%10d\n",i);
                else 
                    System.out.printf("%10d ",i);
                if ( count == 100)
                    break;
            }
        }
    }
}