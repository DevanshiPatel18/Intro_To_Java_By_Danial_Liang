package problem13;

public class problem13 {

    public static void displayStudent(Course c) {
        String[] students = c.getStudet();
        for(int i =0; i <students.length; ++i)
            System.out.println(students[i]+" ");
        
        System.out.println();
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Course c1 = new Course("Maths");
        c1.addStudent("Mary");
        c1.addStudent("John");
        c1.addStudent("Feriha");

        Course c2 = (Course)c1.clone();
        c2.addStudent("Rochard");
        c2.addStudent("Tom");

        displayStudent(c1);
        displayStudent(c2);
    }

}