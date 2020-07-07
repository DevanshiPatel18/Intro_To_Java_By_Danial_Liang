package problem2;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phone_number, String email, String office, long salary, MyDate hired, String title){
        super(name, address, phone_number, email, office, salary, hired);
        this.title = title;
    }   

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "class Staff\nname: "+getName();
    }
}