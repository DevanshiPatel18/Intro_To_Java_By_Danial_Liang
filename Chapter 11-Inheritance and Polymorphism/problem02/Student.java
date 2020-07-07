package problem2;

public class Student extends Person {
   public static final int FRESHMAN = 0;
   public static final int SOPHOMORE = 1;
   public static final int JUNIOR = 2;
   public static final int SENIOR = 3;
    
   private int status;
   
   public Student(String name,String address, String phone_number, String email, int status){
       super(name,address,phone_number,email);
       this.status = status; 
   }

   public int getStatus(){
       return status;
   }

   @Override
    public String toString(){
        return "class: Student \nname: "+ getName();
   }
}