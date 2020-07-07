import java.util.Scanner;

class problem50{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String line = sc.nextLine();
    int count=0;
    for( int i = 0 ; i < line.length();  ++i){
    if (Character.isUpperCase(line.charAt(i)))
    count++;
          }
    System.out.println("The number of uppercase letters are: "+count);
  }
}
