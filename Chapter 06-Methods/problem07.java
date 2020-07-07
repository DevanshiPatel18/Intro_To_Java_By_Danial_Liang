import java.util.Scanner;


public class problem7 {

    public static double futureInvestmentValue(double amt, double intrest, int years){
        
        return amt*Math.pow(1+intrest,years*12);
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double amount = sc.nextDouble();
        System.out.print("Annual intrest rate: ");
        double intrest = sc.nextDouble();
        System.out.print("Years: ");
        int years = sc.nextInt();

        System.out.println("years \t Future Value");
        for( int i = 1; i<=years ;i++){
            System.out.printf("%-5d",i);
            System.out.printf("%-5.2f",futureInvestmentValue(amount, intrest/1200, i));
            System.out.println();
        }

        sc.close();
    }
}