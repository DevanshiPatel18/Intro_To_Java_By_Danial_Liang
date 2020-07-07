import java.util.Scanner;

class problem48{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String words = sc.nextLine();
    int count=1;
    for( int i =0; i < words.length(); ++i){
      if(count%2!=0){
        System.out.print(words.charAt(i)+"");
      }
      count++;
    }
  }
}
