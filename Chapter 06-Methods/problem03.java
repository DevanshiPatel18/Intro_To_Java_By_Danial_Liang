import java.util.Scanner;

public class problem3 {
public static boolean isPalindrome(int n){

    return n == reverse(n) ? true:false;
}

public static int reverse(int n){
    int temp=0;

    while(n>0){
        temp = temp*10 + n%10;
        n /= 10;
    }

    return temp;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    if (isPalindrome(number))
        System.out.println("The number is palindrome!");
    else
        System.out.println("The number is not palindrome!");

        sc.close();
}
    
}