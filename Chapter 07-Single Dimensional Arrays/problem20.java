import java.util.Scanner;
public class problem20 {
    public static int selectionSort(int[] array){
        for( int i =array.length-1; i > 0 ; --i){
            for( int j = i-1; j >=0;--j){
                if(array[j] > array[i] ){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array));
        return array[array.length-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers:");
        int[] array = new int[10];

        for( int i =0; i < array.length; ++i)
            array[i] = sc.nextInt();

        System.out.println(selectionSort(array));
        sc.close();
        
    }
}