import java.util.*;
class problem36{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN integer: ");
    String number = sc.nextLine();
    int sum=0;
    for(int i=0;i<9;++i){
      sum+=Integer.parseInt(number.charAt(i)+"")*(i+1);
    }
    sum%=11;
    System.out.print("The ISBN code is: ");
    for(int i=0;i<9;i++)
      System.out.print(number.charAt(i)+"");
    if ( sum == 10 )
      System.out.println('X');
    else
      System.out.println(sum);
  }
}
