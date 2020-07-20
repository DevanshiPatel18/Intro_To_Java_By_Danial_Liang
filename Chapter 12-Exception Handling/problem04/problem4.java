package problem04;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan amount:");
        double amt = sc.nextDouble();
        System.out.print("Enter intrest:");
        double intrest = sc.nextDouble();
        System.out.print("Enter years:");
        int years = sc.nextInt();

        Loan loan;
        try{
        loan = new Loan(intrest, years, amt);
        System.out.println(loan.toString());
        }
        catch(IllegalArgumentException e){
            System.out.println("Intrest or years or Amount cannot be less than zero");
        }
        sc.close();
    }
}