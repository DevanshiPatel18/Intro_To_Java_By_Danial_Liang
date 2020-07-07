package problem3;

public class CheckingAccount extends Account{
    
    private double overdraftLimit;

    // constructors
    public CheckingAccount(int id, double balance, double overdraftLimit) {
      super(id, balance);
      this.overdraftLimit = overdraftLimit;
    }
  
    // instance methods
    @Override
    public void withdraw(double amount) {
      if (getBalance() - amount >= 0 - overdraftLimit) {
        setBalance(getBalance() - amount);
      }
    }
}