import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      System.out.println("Enter marks (enter negetive marks to quit):");

        float[] scores = new float[100];
        float num ;
        float sum=0 ;
        int count=0;
        int numbersEntered =0;
        for( int i =0; i<100; ++i){

            num = sc.nextFloat();

            if (num < 0)
                break;
            ++numbersEntered;
            scores[i] = num;
            sum += num;
        }

        float average = sum/numbersEntered;
        
        for(int i=0; i< numbersEntered; ++i){
            if(scores[i] >= average)
                ++count;
        }

        System.out.println("the average is "+average+". Students above average is "+count+" and below average is "+(numbersEntered-count));

      sc.close();
    }
}