import java.util.Scanner;

public class problem6 {

    public static void displayPattern( int n ){

        for(int i = 1; i<=n ;i++){
            for(int j = n ;j>=i; j--){
                System.out.printf("%7s"," ");
            }
            for(int k =i; k>0 ;k--)
            System.out.printf("%7d",k);

            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n:");
        int n =sc.nextInt();

        displayPattern(n);

        sc.close();
    }    
}