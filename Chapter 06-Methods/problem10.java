

public class problem10 {
    
    public static boolean isPrime(int n){

        for( int i = 2; i <= Math.sqrt(n); ++i){
            if(n%i==0){
                return false;
            }
        }
       return true;
    }

    public static void main(String[] args) {
        
        int count =0;

        for ( int i = 1 ; i<= 10000 ;++i){
            if (isPrime(i)){
                ++count;
                if (count%10 ==0){
                    System.out.printf("%-6d \n",i);
                }
                else
                    System.out.printf("%-6d",i);
            }
        }

    }
}