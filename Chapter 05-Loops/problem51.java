import java.util.Scanner;

class problem51{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String line1 = sc.nextLine();
    System.out.print("ENter the second string: ");
    String line2 = sc.nextLine();
    String commonPrefix="";
    int index=0;
    while(line1.charAt(index)==line2.charAt(index)){
      commonPrefix+=line1.charAt(index);
      index++;
    }
    if(commonPrefix.length()>0)
      System.out.println("The common prefix is "+commonPrefix);
    else
      System.out.println(line1+" and "+line2+" have no common prefix");

  }
}
