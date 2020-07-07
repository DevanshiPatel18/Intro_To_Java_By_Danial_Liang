package problem9;

import java.util.ArrayList;
import java.util.Scanner;

public class answer9 {
    public static int[][] getRandomAray(int n) {
        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; ++i){
            for(int j =0 ; j < arr.length; ++j){
                arr[i][j] = (Math.random() >= 0.5 ? 1 : 0);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();

        System.out.println("Enter the array size:");
        int n =sc.nextInt();
        int[][] arr = getRandomAray(n);

        int maxRowCount = -1, maxColumnCount = -1;
        for(int i =0; i < arr.length; ++i){
            int rowcount =0, columncount =0;
            for(int j =0; j <arr.length; ++j){
                if (arr[i][j] == 1)
                    rowcount++;
                if (arr[j][i] == 1)
                    columncount++;
                System.out.print(arr[i][j]+ " ");
            }
            if (rowcount >= maxRowCount){
               
                if (rowcount == maxRowCount){
                    row.add(i);
                }
                else{
                row.clear();
                row.add(i);
                }
                maxRowCount = rowcount;
            }
            if (columncount >= maxColumnCount){
               
                if (columncount == maxColumnCount)
                    column.add(i);
                else{
                column.clear();
                column.add(i);
                }
                maxColumnCount = columncount;
            }
            System.out.println();
        }

        System.out.println("The largest row index:" + row);
        System.out.println("The largest column index:"+column);

        sc.close();

    }
}