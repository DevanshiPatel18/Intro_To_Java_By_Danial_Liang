package problem8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transactions> transactions = new ArrayList<>();

    public Account(String name,int id,double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public String getName(){
        return name;
    }

    public ArrayList<Transactions> getTransactions(){
        return transactions;
    }

    public int getId() {
        return id;
      }
    
      public double getBalance() {
        return balance;
      }
    
      public double getAnnualInterestRate() {
        return annualInterestRate;
      }
    
      public Date getDateCreated() {
        return dateCreated;
      }
    
      // setters
      public void setName(String name){
        this.name = name;
      }

      public void setId(int id) {
        this.id = id;
      }
    
      public void setBalance(double balance) {
        this.balance = balance;
      }
    
      public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
      }
    
      // instance methods
      public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
      }
    
      public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
      }
    
      public void withdraw(double amount) {
        Transactions t = new Transactions('W', amount, balance, "");
        setBalance(getBalance() - amount);
        transactions.add(t);
      }
    
      public void deposit(double amount) {
        Transactions t = new Transactions('D', amount, balance, "");
        setBalance(getBalance() + amount);
        transactions.add(t);
      }
    
      @Override
      public String toString() {
        StringBuilder trans = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
          trans.append(transactions.get(i));
        }
        return "name: " + name + "\nbalance: " + getBalance() +
               "\nmonthly interest: " + getMonthlyInterest() +
               "\ndate created: " + getDateCreated() +
               "\ntransactions: \n" + trans;
      }
}