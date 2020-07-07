import java.util.Scanner;

public class problem20 {
    public static int countLetters(String s){

        int letters =0;

        for ( int i =0; i < s.length(); ++i){
            if(Character.isLetter(s.charAt(i)))
                letters++;
        }

        return letters;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("The length is :"+countLetters(s));

        sc.close();

    }
}