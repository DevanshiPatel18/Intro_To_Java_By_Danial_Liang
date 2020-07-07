import java.util.Scanner;
class problem45{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    double mean=0.0,standard_deviation=0.0;
    double sum_of_squares=0,sum_of_numbers=0;
    for( int i =0; i < arr.length ;i++){
      double number = Float.parseFloat(arr[i]);
        sum_of_numbers+=number;
        sum_of_squares+=Math.pow(number,2);
    }
    mean = sum_of_numbers/arr.length;
    standard_deviation = Math.sqrt((sum_of_squares-(Math.pow(sum_of_numbers,2)/arr.length))/(arr.length-1));
    System.out.printf("The mean is %.2f \nThe standard deviation is %.5f",mean,standard_deviation);
  }
}
