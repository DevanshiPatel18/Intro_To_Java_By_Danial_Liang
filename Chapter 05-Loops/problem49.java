import java.util.Scanner;

class problem49{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter a string : ");
    String words = sc.nextLine();
    int count=0,whitespace=0;
    for(int i =0; i< words.length(); ++i){
      char letter = words.charAt(i);
      switch(letter){
        case 'A': count++; break;
        case 'a': count++; break;
        case 'E': count++;break;
        case 'e': count++;break;
        case 'I': count++;break;
        case 'i': count++;break;
        case 'O': count++;break;
        case 'o': count++;break;
        case 'U': count++;break;
        case 'u': count++;break;
        case ' ': whitespace++;
          }
    }
    System.out.println("The number of vowels are: "+count);
    System.out.println("The number of consonents are: "+(words.length()-count-whitespace));
  }
}
