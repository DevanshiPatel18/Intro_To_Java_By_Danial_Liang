package problem7;
import java.util.Scanner;

public class answer7 {
    public static void printMenu(){
        System.out.println("Main Menu");
        System.out.println("1 : check balance");
        System.out.println("2 : withdraw");
        System.out.println("3 : deposit");
        System.out.println("4 : exit");
        System.out.print("Enter a choice: ");
    }
    public static void main(String[] args) {
      

        Account[] accounts = new Account[10];
        for(int i =0; i < accounts.length; ++i){
            accounts[i] = new Account(i,100);
        }
        
        int id = -1;
        Scanner sc = new Scanner(System.in);
        while(true){
           
            while(true){
            System.out.print("Enter an id: ");
            id = sc.nextInt();
            if (id >= 0 && id <=9)
                break;
            }

            int choice = -1;
            int flag =0 ;
            do{
                printMenu();
                choice = sc.nextInt();

                switch(choice){
                    case 1: System.out.println(accounts[id - 1].getBalance());
                        break;
                    case 2: 
                        System.out.print("Enter a amount to withdraw: ");
                        accounts[id - 1].withdraw(sc.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter the amount: ");
                        accounts[id - 1].deposit(sc.nextDouble());
                        break;
                    case 4: flag =1;
                        break;
                    }
                    if ( flag == 1)
                        break;
            }while(choice != 4);
            
        }
        
    }
}