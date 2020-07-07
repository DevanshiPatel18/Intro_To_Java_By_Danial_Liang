import java.util.*;
class problem47{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ISBNcode = sc.next();
    if(ISBNcode.length()!=12){
      System.out.println("Invalid input");
    }
    else{
    long sum=0;
    int count=1;
    long code = Long.parseLong(ISBNcode);
    for( int i =0; i <ISBNcode.length() ;i++){
      count++;
      long a =code%10;
      if(count%2==0){
        sum+=3*a;
    }
    else{
      sum+=a;
    }
    code=code/10;
    //System.out.print(sum+" ");
    }
    sum=10-(sum%10);
    if (sum==10)
      System.out.println(ISBNcode+"0");
    else
      System.out.println(ISBNcode+""+sum);
    }
  }
  }
