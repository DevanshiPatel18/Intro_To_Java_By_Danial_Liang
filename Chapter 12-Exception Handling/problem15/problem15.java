package problem15;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        File file = new File("Excercise12_15");

        if (file.exists()){
            System.out.println("This file already exsits !");
            System.exit(0);
        }

        try(PrintWriter writer = new PrintWriter(file)){
            for(int i =0; i < 100; ++i){
                writer.print((int)(Math.random()*101)+" ");
            }
        }catch(Exception s){
        }
        int[] arr = new int[100];
        try(Scanner sc = new Scanner(file)){
            for(int i =0; i < 100; ++i){
                arr[i] = sc.nextInt();
            }
        }
         catch (Exception e) {
        }
            java.util.Arrays.sort(arr);
            System.out.println(java.util.Arrays.toString(arr));

    }
}