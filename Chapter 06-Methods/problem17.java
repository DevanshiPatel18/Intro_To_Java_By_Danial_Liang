import java.util.Scanner;

public class problem17 {
    public static void printMatrix(int n){

        for( int i = 1; i <= n*n ; ++i){
            
            if( i % n ==0){
                System.out.println( (Math.random() < 0.5) ? 0 : 1 );  //or we can also use this ((int)(Math.random()*2))
            }
            else
                System.out.print( ((Math.random() < 0.5) ? 0 : 1)+ " " );
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printMatrix(n);

        sc.close();
    }
}