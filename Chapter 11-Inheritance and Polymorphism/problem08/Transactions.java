package problem8;
import java.util.Date;

public class Transactions {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transactions(char type, double amount, double balance,String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    //getters
    public Date getDate(){
        return date;
    }
    public char getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getDescription(){
        return description;
    }

    //setters

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "class: Transactions\nDate: "+getDate()+"\nType: "+getType()+"\nAmount: "+getAmount()+"\nBalance:"+getBalance()+"\nDescription: "+getDescription();
    }

}