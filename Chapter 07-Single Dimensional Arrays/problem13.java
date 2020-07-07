
import java.util.Arrays;
public class problem13 {
    public static int getRandom(int... numbers) {
        Arrays.sort(numbers);
        while(true){
            int i = (int)(1 + Math.random()*55);
            if (Arrays.binarySearch(numbers,i) > 0 )
                continue;
            else
                return i;
        }
    }   
}