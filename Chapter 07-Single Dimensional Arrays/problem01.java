import java.util.Scanner;
import java.util.Arrays;

public class problem1{
    public static char getGrade(float best, float score){
        if ( score >= best -10 )
            return 'A';
        else if ( score >= best - 20 )
            return 'B';
        else if ( score >= best -30 )
            return 'C';
        else if ( score >= best -40 )
            return 'D';
        else
            return 'F';

    }

    public static float getBest(float[] scores){

        Arrays.sort(scores);
        return scores[scores.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students:");
        int numberOfStudents = sc.nextInt();
        System.out.print("Enter "+numberOfStudents+" scores:");
        float[] marks = new float[numberOfStudents];
        for( int i = 0; i < numberOfStudents; ++i){
            marks[i] = sc.nextFloat();
        }

        float best = getBest(marks); 
        for( int i =0; i < numberOfStudents; ++i){

            System.out.println("Student "+i+"scored "+marks[i]+" and grqade is "+getGrade(best, marks[i]));
        }
        sc.close();
    }
}