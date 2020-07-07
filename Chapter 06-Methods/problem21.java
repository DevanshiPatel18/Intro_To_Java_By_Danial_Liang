import java.util.Scanner;

public class problem21 {
    
    public static int getNumber(char uppercaseLetter){

        if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;
    }
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a number:");
            String s = sc.nextLine();

            for(int i =0; i < s.length(); i++){
                if(Character.isLetter(s.charAt(i)))
                    System.out.print(getNumber(Character.toUpperCase(s.charAt(i))));
                else{
                    if(Character.isDigit(s.charAt(i)))
                        System.out.print(s.charAt(i));
                }
                    
            }
            sc.close();
        }
    
        
    
}
