package problem6;

import problem5.StackOfIntegers;
    
public class answer6 {
    public static boolean isPrime(int n){
        for(int i =2 ; i <= Math.sqrt(n); ++i){
            if ( n % i == 0 )
                return false;
        }
        return true;
    } 
    public static void main(String[] args) {
      
        StackOfIntegers stack = new StackOfIntegers();
        for(int i =2 ; i <=120 ; ++i ){
            if (isPrime(i)){
                stack.push(i);
            }
        }

        while(!stack.empty()){
            try{
            System.out.println(stack.peep());
            stack.pop();
            }
            catch(Exception e){

            }
        }
    }
}