package problem5;

public class answer5 {
    public static void main(String[] args) {
        Course course = new Course("Maths");
        course.addStudent("Devanshi");
        course.addStudent("Dhyeya");
        System.out.println(course.getStudents());
        course.getNumberOfStudents();
        course.dropStudent("Devanshi");
        course.getNumberOfStudents();
        System.out.println(course.getStudents());
    }
}