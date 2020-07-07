package problem6;
public class answer6 {
    public static int[] buildArray() {
        int[] array = new int[10000];
        for(int i =0; i < array.length; ++i){
            array[i] = (int)(Math.random()*10000);
        }

        return array;
    }

    public static void sort(int[] array) {

        for(int i =0 ; i < array.length -1; ++i){
            int minIndex = i;
            for(int j = i+1; j < array.length; ++j){
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        
    }
    public static void main(String[] args) {
        Stopwatch myStopwatch = new Stopwatch();

        myStopwatch.start();
        sort(buildArray());
        myStopwatch.stop();

        System.out.println("Time spent to sort 10,000 elements is:"+myStopwatch.getElapsedTime()+"ms");
    }
}