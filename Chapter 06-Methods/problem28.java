public class problem28 {
    public static boolean prime(long num){

        for ( int i = 2; i <= Math.sqrt(num); ++i){

            if ( num % i == 0 )
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
        System.out.println("p \t\t 2^p-1");
        System.out.println("-------------------------------");
        for ( int i = 2; i <= 31; ++i){
            
            long temp = (long)Math.pow(2,i) - 1;
            if ( prime(temp) )
                System.out.printf("%d %15d\n",i,temp);
        }
    }
}