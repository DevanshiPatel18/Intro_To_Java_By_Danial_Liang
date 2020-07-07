import java.util.Scanner;

public class problem23 {
    
    public static int count(String str, char a){

        int count=0;

        for( int i =0; i < str.length(); ++i){
            if(str.charAt(i)==a)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        System.out.print("Enter a char: ");
        String ch = sc.next();

        System.out.print("The count of '"+ch+"' in '"+s+"' is :"+count(s,ch.charAt(0)));
        
        sc.close();
    }
}