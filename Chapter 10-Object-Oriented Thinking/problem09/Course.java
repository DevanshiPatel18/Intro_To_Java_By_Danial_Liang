package problem9;

public class Course{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents=-1;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if (numberOfStudents >= students.length){
            String[] temp = new String[students.length*2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        numberOfStudents++;
        students[numberOfStudents] = student;
    }

    public String[] getStudents(){
        return students;
    }

    public int  getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        int place = -1 ;
        for(int i = 0 ; i <= numberOfStudents ; ++i){
            if (students[i]==(student)){
                place = i;
                break;
            }
        }
        if (place >= 0){
            for(int i = place; i <= numberOfStudents; ++i){
                students[i] = students[i+1];
            }
            numberOfStudents--;
        }
        else{
            System.out.println("Student not in record");
        }
    }

    public void clear(){
        String[] temp = new String[students.length];
        students = temp;
    }
}