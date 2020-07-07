import java.util.Scanner;
import java.util.Arrays;
public class problem21 {
    public static String getPattern(int slots){
        String pattern = "";
        for( int i =0 ; i < slots; ++i){
            int temp = (int)(Math.random()*11);
            if ( temp < 5)
                pattern += 'L';
            else
                pattern += 'R';
        }
        return pattern;
    }

    public static int[] decodePattern(String pattern,int[] ballsCountinSlots){
        int slotNumber =0;
        for( int i =0; i < pattern.length(); ++i){
            if( pattern.charAt(i) == 'L'){
                if (slotNumber == 0 )
                    continue;
                else
                    slotNumber--;
            }
            else{
                if (slotNumber == ballsCountinSlots.length-1)
                   continue;
                else
                    slotNumber++;

        }
    }
        ballsCountinSlots[slotNumber]++;
        //System.out.println(Arrays.toString(ballsCountinSlots));
        return ballsCountinSlots;
    
    }

    public static int[] mysort(int[] array){
        Arrays.sort(array);
        return array;
    }
    public static void printHistogram(int[] ballsCountinSlots,int balls){
       
       for( int i =balls; i >0; --i){
        for( int j=0; j <ballsCountinSlots.length; ++j){
            if(ballsCountinSlots[j] == i)
            {
                System.out.print("| 0 |");
               ballsCountinSlots[j]--;
            }
            else
                System.out.print("|   |");

            }
            System.out.println();
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of balls:");
        int balls = sc.nextInt();
        System.out.print("Enter number of slots:");
        int slots = sc.nextInt();
        int[] ballsCountinSlots = new int[slots];

        for(int i = 0; i < balls ;++i){

        String pattern = getPattern(slots);
        System.out.println(pattern);
        ballsCountinSlots = decodePattern(pattern,ballsCountinSlots);
    }
    printHistogram(ballsCountinSlots,balls);

    sc.close();
    }
}