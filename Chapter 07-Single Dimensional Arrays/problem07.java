public class problem7 {
    public static int[] getRandomNumberWithCount(int[] arr){
        int a = (int)(1 + Math.random()*10);
        arr[a-1]++;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for( int i=0; i<100; ++i){
            arr = getRandomNumberWithCount(arr);
        }
        System.out.println("The count is: ");
        for( int i =0; i < arr.length; ++i){
            System.out.println("Count of "+(i)+" is "+arr[i]);
        }
    }
}