package problem13;
import java.util.Scanner;
public class answer13 {
    public static Location locateLargest(double[][] a){
        Location location = new Location(a.length, a[0].length);
        location.maxValue = a[0][0];
        for(int i =0; i < a.length; ++i){
            for(int j =0; j < a[0].length; ++j){
                if(a[i][j] > location.maxValue){
                    location.maxValue = a[i][j];
                    location.row=i;
                    location.column =j;
                }
            }
        }
        return location;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and column in the array:");
        int rows = sc.nextInt();
        int column = sc.nextInt();

        double[][] a = new double[rows][column];

        System.out.println("Enter the array:");
        for(int i =0 ; i < a.length; ++i){
            for(int j = 0; j  <a[0].length; ++j)
                a[i][j] = sc.nextDouble();
        }
        Location location = locateLargest(a);

        System.out.println("The location of the largest element is "+location.maxValue+" at ("+location.row+","+location.column+").");
        sc.close();
    }
   

}