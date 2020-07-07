

public class problem6 {

    public static boolean isPrime(int num){

        for( int i =2; i <= Math.sqrt(num); ++i){
            if ( num % i ==0 )
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        for( int i = 2; ; ++i){
            if( isPrime(i)){
                count++;
                if( count % NUMBERS_PER_LINE ==0 )
                    System.out.printf("%3d\n",i);
                else
                    System.out.printf("%3d ",i);
                }
            if (count ==50)
                break;
        }
      
    }
}