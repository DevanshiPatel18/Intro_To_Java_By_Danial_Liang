package problem7;

public class answer7 {
    public static void main(String[] args) {
        Account myAccount = new Account(1122,20000);
        myAccount.setAnnualInterestRate(4.5);
        

        myAccount.withdraw(2500);
        
        myAccount.deposit(3000);
        System.out.println("Balance:"+myAccount.getBalance());
        System.out.println("Monthly interest :"+myAccount.getMonthlyInterest());
        System.out.println("Date created: "+myAccount.getDateCreated());
    }
}