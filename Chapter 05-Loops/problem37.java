import java.util.Scanner;

class problem37{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter decimal number :");
    long number = sc.nextLong();
    String binary = "";
    for ( long i =number ; i >=0 ; i=i/2){
      if(i==1){
        binary+='1';
        break;
      }
      else
        binary+=Long.toString(i%2);
    }
    for(int i=binary.length()-1; i>=0; i--){
      System.out.print(binary.charAt(i)+"");
    }
  }
}
