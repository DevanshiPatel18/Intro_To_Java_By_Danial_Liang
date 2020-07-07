import java.util.Scanner;

public class problem4 {
    
    public static void reverse(int n){


        System.out.print("the reverse is: ");
        
        while(n>0){
            System.out.print(n%10);
            n /= 10;
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        reverse(number);

        sc.close();
    }
}