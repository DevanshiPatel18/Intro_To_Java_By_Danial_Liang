import java.util.Scanner;

public class problem22 {

    public static double sqrt(long n){
        double lastGuess=Math.random()*100, nextGuess=(lastGuess + n/lastGuess)/2; 
       
        while(Math.abs(nextGuess-lastGuess) >= 0.0001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n/lastGuess)/2;
            
        }
        return nextGuess;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        long n =sc.nextLong();

        System.out.println("The sqrt is of "+n+" is "+sqrt(n));
        sc.close();
    }
    
}