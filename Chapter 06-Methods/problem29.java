public class problem29 {
    public static boolean prime(long n){
        for( int i =2; i <= Math.sqrt(n); ++i){
            if ( n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
        for( long  i = 2; i <=998; ++i ){
            if( prime(i) && prime(i+2))
                System.out.printf("(%d, %d)\n",i,i+2);
            
        }
    }
}