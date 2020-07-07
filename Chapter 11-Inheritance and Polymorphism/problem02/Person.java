package problem2;

public class Person {
    private String name,address,phone_number,email;

    public Person(String name, String address, String phone_number, String email){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }

    // getters

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phone_number;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "class: Person\nname: "+ getName();
    }
}