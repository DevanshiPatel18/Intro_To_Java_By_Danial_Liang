import java.util.Scanner;

public class problem2 {
    public static int sumDigits(long n){
        int sum = 0;

        while(n>0){
            sum += n%10;
            n /= 10;
        }

        return sum;
   
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer:");
        long n = sc.nextLong();

        System.out.println("The sum of digits is: "+sumDigits(n));
    
        sc.close();
    }
}