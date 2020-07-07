import java.util.Scanner;
public class problem37 {
    public static String format(int number, int width){

        int length  = Integer.toString(number).length();

        if ( length < width){
            int count=0;
            String temp = "";
            while(count <width-length){
                temp += '0';
                count++;
            }
          return temp += number;
        }
        return Integer.toString(number);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number and width: ");
        int number = sc.nextInt();
        int width = sc.nextInt();

        System.out.println(format(number,width));
    }
}