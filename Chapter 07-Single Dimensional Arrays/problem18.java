public class problem18 {
    public static int[] bubblesort(int[] array) {
        for( int i =0; i < array.length -1; ++i){
            for( int j= i+1; j < array.length; ++j){
                if ( array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Enter 10 numbers:");
        for( int i=0; i< array.length; ++i)
            array[i] = sc.nextInt();

        System.out.println("The sorted array is:"+java.util.Arrays.toString(bubblesort(array)));
        sc.close();
    }
}