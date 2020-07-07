import java.util.Scanner;
class problem21{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amt:");
		int amt=sc.nextInt();
		System.out.print("Enter years:");
		int yrs=sc.nextInt();
		double intrest=5f;
		final double increment=1/8f;
		System.out.println("Intrest \t Monthly \t yearly");
		for(double i=intrest;i<=8f;i+=increment)
		{
			double monthly=0,yearly=0;
			//monthly
			double rate=i/1200;
			monthly=amt*(rate/(1-1/Math.pow(1+rate,yrs*12)));
			//yearly
			yearly=monthly*12f*yrs;
			//display
			System.out.printf("%2.3f \t %2.2f \t %2.2f ",i,monthly,yearly);
			System.out.println();
		}
	}
}
