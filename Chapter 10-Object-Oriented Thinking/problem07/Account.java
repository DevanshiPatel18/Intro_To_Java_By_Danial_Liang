
package problem7;

import java.util.Date;

public class Account {
    private int id;
    private double balance ;
    private double annualIntrestRate;
    private Date dateCreated;

    Account(){
        id =0;
        balance =0;
        annualIntrestRate =0;
        dateCreated = new Date();
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    int getId(){
        return id;
    }

    void setId(int id){
        this.id = id;
    }

    double getAnnualInterestRate(){
        return annualIntrestRate;
    }

    void setAnnualInterestRate(double annualInterestRate){
        this.annualIntrestRate = annualInterestRate;
    }

    double getBalance(){
        return balance;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    Date getDateCreated(){
        return dateCreated;
    }

    double getMonthlyInterestRate(){
        return annualIntrestRate/1200;
    }

    double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }

    void withdraw(double withdrawnAmout){
        balance  -= withdrawnAmout;
    }

    void deposit(double depositeAmount){
        balance += depositeAmount;
    }
}