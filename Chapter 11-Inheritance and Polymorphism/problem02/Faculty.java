package problem2;

public class Faculty extends Employee {
    private int office_hours;
    private int rank;

    public Faculty(String name, String address, String phone_number, String email, String office,long salary,MyDate hired ,int office_hours,int rank){
        super(name, address, phone_number, email, office, salary, hired);
        this.office_hours = office_hours;
        this.rank = rank;

    }

    public int getOfficeHours(){
        return office_hours;
    }

    public int getTank(){
        return rank;
    }

    @Override
    public String toString(){
        return "class: Faculty\nname: "+getName();
    }


}