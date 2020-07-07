import java.util.Scanner;
class problem25{
  public static void main(String[] args) {
    double n=10000.0;
    while(n<=100000){
    double sum=0.0;
    double pi1=0.0;
    for(double i =n; i>=1.0;--i){
      sum+=Math.pow(-1,i+1)/(2.0*i-1);
    }
    pi1=4.0*sum;
    System.out.println("for n="+n+" pi is "+pi1);
    n+=10000.0;
  }
}
}
