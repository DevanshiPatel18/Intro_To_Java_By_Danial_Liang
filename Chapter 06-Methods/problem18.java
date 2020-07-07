import java.util.Scanner;

public class problem18 {
    public static boolean passwordChecker(String password){

        return (password.length() >=8 && onlyLettersAndDigits(password) && hasNDigits(password) );

    }

    public static boolean onlyLettersAndDigits(String password){
        for( int i =0; i < password.length(); ++i){
            if( !Character.isLetterOrDigit(password.charAt(i)) )
                return false;
        }

        return true;
    }

    public static boolean hasNDigits(String password){
        int count =0;
        for( int i =0; i < password.length(); ++i){

            if(Character.isDigit(password.charAt(i)))
                count++;
            if (count >=2)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.next();

        if (passwordChecker(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");

        sc.close();
    }
}