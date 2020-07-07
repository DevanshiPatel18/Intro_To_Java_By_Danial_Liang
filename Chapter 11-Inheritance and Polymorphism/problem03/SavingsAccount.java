package problem3;



public class SavingsAccount extends Account {
    
    public SavingsAccount(int id, double balance) {
        super(id, balance);
      }
    
      // instance methods
      @Override
      public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
          setBalance(getBalance() - amount);
        }
      }
}