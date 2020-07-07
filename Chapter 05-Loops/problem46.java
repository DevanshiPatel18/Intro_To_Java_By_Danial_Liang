import java.util.Scanner;
class problem46{
  public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
    System.out.print("Enter a string: ");
    String word = sc.nextLine();
    String reversedWord="";

    for( int i = word.length()-1; i>=0; --i){
      reversedWord+=word.charAt(i);
    }
    System.out.println(reversedWord);
  }
}
