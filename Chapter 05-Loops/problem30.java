import java.util.Scanner;
class problem30{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Amount:");
    int amt =sc.nextInt();
    System.out.print("enter intrest:");
    double intrest = sc.nextDouble();
    System.out.print("enter months:");
    int months1 = sc.nextInt();
    double monthlyInterest = (intrest/100)/12;
    double total=0;
    for(int i=0;i<months1;i++){
      double n =total+amt;
      total=n*(1+monthlyInterest);
    }
    System.out.printf("The total amount in your savings account is : $%.2f",total);


  }
}
