import java.util.Scanner;
class problem31{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount:");
    double amt = sc.nextDouble();
    System.out.println("Enter Anuual % yeild:");
    double yeild = sc.nextDouble();
    System.out.println("Enter months:");
    int months = sc.nextInt();
    double rate = yeild/1200;
    System.out.println("Month \t Amount");
    for(int i=1;i<=months;++i){
      System.out.print(i+"\t");
      amt+=amt*rate;
      System.out.printf("%.2f\n",amt);

    }

  }
}
