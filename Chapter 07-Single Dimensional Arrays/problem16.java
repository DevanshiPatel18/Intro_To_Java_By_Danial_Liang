public class problem16 {
    public static int timeForlinearSearch(int[] arr , int key){
       
        for( int i =0; i < arr.length; ++i){
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int timeforBinarySearch(int[] array, int key){
        
        java.util.Arrays.sort(array);
        int low = 0 ;
        int high = array.length -1;

        while(high >= low){

            int mid = (high + low)/2;

            if ( array[mid] == key)
                return mid;
            else if ( key > array[mid])
                low = mid + 1;
            else 
                high = mid -1;
        }
        return -low-1;
    }

    public static int[] generateArray(){
        int[] arr = new int[1000000];
        for( int i =0 ;i < 1000000; ++i){
            arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] array = generateArray();
        int key = (int)(Math.random()*10);

        long startTime = System.currentTimeMillis();
        int index = timeForlinearSearch(array, key);
        long endTime = System.currentTimeMillis();
        System.out.println("Linear search took: "+ (endTime - startTime)+" seconds.");

        long startTime1 = System.currentTimeMillis();
        index =  timeforBinarySearch(array, key);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Binary search took: "+ (endTime1 - startTime1)+" milliseconds.");
       
    }
}