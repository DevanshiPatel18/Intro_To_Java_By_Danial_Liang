import java.util.Scanner;

class problem41{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    String[] arr = sc.nextLine().split(" ");
    int max=Integer.parseInt(arr[0]),count=0;
    for( int i =1; i < arr.length ;i++){
      int j =Integer.parseInt(arr[i]);
      if(j > max){
        max=j;
        count=1;
        continue;
      }
      if( j == max){
        count++;
      }
    }
    System.out.println("Largest number is : "+max+"\nThe occurance of the largest number is : "+count);
  }
}
