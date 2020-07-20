package problem25;

import java.util.Scanner;
import java.io.File;

public class problem25 {
    public static void main(String[] args) {
        File file = new File("c:/users/pdevs/desktop/Salary.txt");
        
        double assistant = 0.0;
        double associate = 0.0;
        double full = 0.0;
        int noOfAssistant =0 ;
        int noOfAssociate = 0;
        int noOfFull = 0;

        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNext()){
            String[]  s = sc.nextLine().split(" ");
            switch(s[2]){
                case "assistant" :  noOfAssistant++;    
                                    assistant += Double.parseDouble(s[3]);
                                    break;

                case "associate" :  noOfAssociate++;
                                    associate += Double.parseDouble(s[3]);
                                    break;

                case "full" :       noOfFull++;
                                    full += Double.parseDouble(s[3]);
                                    break;
            }
           
            }
            System.out.printf("Assistant: \nsum: %7.2f \naverage: %7.2f",assistant,(assistant/noOfAssistant));
            System.out.printf("\nAssociate: \nsum: %7.2f \naverage: %7.2f",associate,(associate/noOfAssociate));
            System.out.printf("\nFull: \nsum: %7.2f \naverage: %7.2f",full,(full/noOfFull));

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}