import java.util.Scanner;
class problem23{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sum1=0.0,sum2=0.0;
    // from right to left
    for(double i  = 50000.0; i>=1.0 ; --i){
      sum1=sum1+1/i;
    }
    //from left to right
    for(double i =1.0; i<=50000.0 ;i++){
      sum2+=1/i;
    }    System.out.println("Sum from right to left:"+sum1+"\nSum from left to right:"+sum2);
  }
}
