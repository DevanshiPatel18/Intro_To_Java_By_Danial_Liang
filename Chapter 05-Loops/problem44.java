
import java.util.Scanner;
class problem44{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter an integer : ");
    short number = sc.nextShort();
    String bits = "";

    for( int i =0; i < 16; i++ ){
      bits = ( number & 1 ) + bits;
      System.out.println(number +" "+bits);
      number >>= 1;
    }
    System.out.println("The bits are "+ bits);
  }
}
