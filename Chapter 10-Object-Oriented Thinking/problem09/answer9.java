package problem9;

public class answer9 {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        course.addStudent("Dhyeya");
        course.addStudent("Keyur");
        course.addStudent("Devanshi");
        System.out.println(java.util.Arrays.toString(course.getStudents()));
        course.dropStudent("Devanshi");
        System.out.println(java.util.Arrays.toString(course.getStudents()));
        
    }
}