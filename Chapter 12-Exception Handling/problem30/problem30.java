package problem30;

import java.util.Scanner;
import java.io.File;

public class problem30{
    public static void getCharCount(String s, int[] arr) {
        for(int i =0; i < s.length(); ++i){
            char c = s.charAt(i);
            if( c >= 'A' && c <= 'Z')
            arr[c - 65]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename:");
        String filename = sc.nextLine();

        File file = new File(filename);

        if(!file.exists()){
            System.out.println("The file does not exist !");
            System.exit(0);
        }

        sc.close();

        int[] countChars = new int[26];
        for(int i =0; i < countChars.length; ++i){
            countChars[i] = 0;
        }
        try (Scanner input = new Scanner(file)) {
            while(input.hasNext()){
               getCharCount(input.next().toUpperCase(),countChars);
               }
               for(int i =0; i < countChars.length; ++i){
                System.out.println("Number of"+(char)('A' + i)+" are:"+countChars[i]);
            
            }
        }
         catch (Exception e) {
            //TODO: handle exception

        }
        }
    }
