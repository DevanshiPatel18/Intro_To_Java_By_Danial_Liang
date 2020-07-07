import java.util.Scanner;

class problem38{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter decimal value: ");
    int number = sc.nextInt();
    String hex = "";
    for ( int  i = number; ; i/=16){
      if ( i<=1){
        break;
      }
      if(i%16 >=10){
      switch(i%16){
        case 10: hex+="A";
          break;
        case 11: hex+="B";
          break;
        case 12: hex+="C";
          break;
        case 13: hex+="D";
          break;
        case 14: hex+="E";
          break;
        case 15: hex+="F";
          break;
      }
    }
    else
        hex+=Integer.toString(i%16);
   }
   System.out.print("Hexademical Eqvivalent is: ");
   for(int i =hex.length()-1;i>=0;--i)
    System.out.print(hex.charAt(i)+"");
  }
}
