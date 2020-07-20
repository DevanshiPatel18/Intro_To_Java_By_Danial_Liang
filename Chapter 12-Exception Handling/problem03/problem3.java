package problem03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class problem3 {
    public static int[] getRandomArray() {
        int[] arr = new int[100];
        for(int i =0; i < arr.length; ++i){
            arr[i] = (int)(Math.random()*101);
        }
        return arr;
    }
    public static void main(String[] args) {
               
        int[] arr = getRandomArray();

        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter index:");
            int index=-1;
           try{
            index = sc.nextInt();
           }
           catch(InputMismatchException e){
                System.out.println("invalid input");
                continue;
               
           }
            try {
                System.out.println(arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("out of bounds");
                continue;
            }      
   
        }while(true);

        

    }
}