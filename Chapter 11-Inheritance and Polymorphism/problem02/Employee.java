package problem2;


public class Employee extends Person {
    private String office;
    private long salary;
    private MyDate date_hired;

    public Employee(String name, String address, String phone_number, String email, String office, long salary, MyDate date_hired){
        super(name, address, phone_number, email);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    public String getOffice(){
        return office;
    }

    public long getSalary(){
        return salary;
    }

    public MyDate getHireDate(){
        return date_hired;
    }

    @Override
    public String toString(){
        return "class : Employee\nname: "+getName();
    }
}