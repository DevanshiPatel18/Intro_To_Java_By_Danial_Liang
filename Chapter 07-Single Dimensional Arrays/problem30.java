import java.util.Scanner;
public class problem30 {
    public static boolean isConsecutiveFour(int[] values){
        for ( int i =0 ; i < values.length -4; ++i){
            if ( values[i] == values[i+1] && values[i+1] == values[i+2] && values[i+2] == values[i+3])
                return true;
        }

        return false;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values:");
        int num = sc.nextInt();
        int[] values = new int[num];

        System.out.println("Enter the values:");
        for ( int i= 0; i <values.length; ++i)
            values[i] = sc.nextInt();

        if(isConsecutiveFour(values))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no four consecutive values");
        sc.close();
        }
}