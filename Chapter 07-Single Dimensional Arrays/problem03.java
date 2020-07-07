import java.util.Scanner;

public class problem3 {

    public static void counts(int[] arr){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
            if ( num > 0 &&  num <=100)
                arr[num - 1]++;

        }while(num > 0);

        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("Enter integrs between 1 to 100 ( to quit press 0 ):");

        int[] count = new int[100];

        counts(count);
        
        for( int i =0; i < count.length; ++i){
            if (count[i] != 0){
                if (count[i] > 1)
                System.out.println((i+1) + " occurs "+ count[i] + " times");
                else
                System.out.println((i+1) + " occurs "+ count[i] + " time");
            }
            }
    }    
}