import java.util.Scanner;
class problem42{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter commission sought: ");
    final double COMMISSION_SOUGHT = sc.nextDouble();
  		double salesAmount, 				// Sales amount
  				 commission,				// Employee commission
  				 balance;					// Sales balance
  		salesAmount = 0;					// Initialize accumulator to 0
  		for(i=commission;i<=COMMISSION_SOUGHT;){
  			balance = commission = 0;	// Set balance and commission to 0
  			salesAmount += 0.01;			// Increase sales amount by $0.01

  			// If sales amount is $10,000.01 and above commission rate is 12%
  			if (salesAmount > 10000)
  				commission += (balance = salesAmount - 10000) * 0.12;

  			// If sales amount is $5,000.01-$10,000 commission rate is 10%
  			if (salesAmount > 5000)
  				commission += (balance -= balance - 5000) * 0.10;

  			// If sales amount is $0.01-$5,000 commission rate is 8%
  			if (salesAmount > 0)
  				commission += balance * 0.08;

  			// While commission is less than commission sought loop
  		} while (commission < COMMISSION_SOUGHT);

  		// Display results
  		System.out.printf("Minimum sales to earn "+COMMISSION_SOUGHT+": $%.0f\n", salesAmount);
  }
}
