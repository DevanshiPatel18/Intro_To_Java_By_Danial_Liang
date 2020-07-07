import java.util.Scanner;
class problem22{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amt = sc.nextInt();
    int years = sc.nextInt();
    int rate = sc.nextInt();
    double monthly=0,yearly=0;

    //computation of monthly & total payment
    double r = rate/1200f;
    monthly=amt*(r/(1-1/Math.pow(1+r,years*12)));
    yearly=monthly*12f*years;
    System.out.printf("Monthly Payment: %.2f \n  Total Payment: %.2f",monthly,yearly);

    //The amortization table
    double balance=amt;
    System.out.println("\nPayment# \t Interest \t Principal \t Balance");
    for(int i=1;i<=12*years;i++){
      double intrest=r*balance;
      double principal=monthly-intrest;
      balance=balance-principal;
      System.out.printf("%d \t\t %.2f \t\t %.2f \t\t %.2f \n",i,intrest,principal,balance);
    }
  }
}
