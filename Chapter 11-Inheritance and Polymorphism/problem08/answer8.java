package problem8;

public class answer8 {
    public static void main(String[] args) {
        Account acc =new Account("George", 1122, 1000);
        acc.setAnnualInterestRate(1.5);
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);

        System.out.println(acc.toString());
    }
}