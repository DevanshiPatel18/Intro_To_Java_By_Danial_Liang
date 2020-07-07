public class problem11 {
    
    public static double computeCommission(double salesAmount){
        
        double balance, 					// Holds the balance
        commission;				// Employee commission
 balance = commission = 0.0;	// Initialize balance and commission to 0

 // If sales amount is $10.000.01 and above commission rate is 12%
 if (salesAmount >= 10000.01)
     commission += (balance = salesAmount - 10000) * 0.12;

 // If sales amount is $5,000.01 to $10,000 commissin rate is 10%
 if (salesAmount >= 5000.01)
     commission += (balance -= balance - 5000) * 0.10;

 // If sales amount is $0.01 to $5,000.01 commissin rate is 8%
 if (salesAmount >= 0.01)
         commission += balance * 0.08;
     
 return commission;
    }

    public static void main(String[] args) {
        System.out.println("Sales Amount \t Commission \n ----------------------------------------------------------");

        for (double i = 10000; i<=100000; i+=5000){
            System.out.printf(" %-16.0f ",i);
            System.out.printf(" %.1f \n",computeCommission(i));
        }
    }
}