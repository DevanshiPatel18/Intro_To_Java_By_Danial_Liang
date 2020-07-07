import java.util.Scanner;
class problem32{
  public static void main(String[] args) {
    int lottery = (int)(10+Math.random()*100);
    while(true){

    if(lottery/10==lottery%10){
      lottery=(int)(Math.random()*100);
    }
    else{
      break;
    }
  }
  Scanner sc = new Scanner(System.in);
  int guess = sc.nextInt();
  int guessDigit1 = guess/10;
  int guessDigit2 = guess%10;
  int lotteryDigit1 = lottery/10;
  int lotteryDigit2 = lottery%10;
System.out.println(lottery);
  if(guess==lottery)
    System.out.println("Exact match: you win $10,000.");
  else if(guessDigit2==lotteryDigit1 && guessDigit1==lotteryDigit2)
    System.out.println("Match all digits: you win $3,000.");
  else if(guessDigit1==lotteryDigit1 || guessDigit2==lotteryDigit2 || guessDigit1==lotteryDigit2 || guessDigit2==lotteryDigit2)
    System.out.println("Match one digit: you win $1,000");
  else
    System.out.println("Sorry,no match.");
  }
}
