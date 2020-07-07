import java.util.Scanner;

public class problem17 {
    public static void orderByMarks(int[] marks, String[] students){
        for( int i = 0; i < marks.length -1; ++i){
            for( int j = i+1; j < marks.length; ++j){
                if( marks[i] > marks[j]){
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                    String temp1 = students[i];
                    students[i] = students[j];
                    students[j] = temp1; 
                }
            }
        }

        for(int i =marks.length -1 ; i >= 0; --i){
            System.out.println(students[i]+" "+marks[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        int[] marks = new int[numberOfStudents];
        String[] students = new String[numberOfStudents];

        for( int i = 0; i < numberOfStudents; ++i){
            System.out.print("Enter student marks and name:");
            marks[i] = sc.nextInt();
            students[i] = sc.nextLine();
        }

        orderByMarks(marks,students);

        sc.close();
    }   
}