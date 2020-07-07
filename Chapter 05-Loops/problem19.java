class problem17{
	public static void main(String[] args)
	{
		int rowcount=0;
		for(int i=0;i<=8;i++)
		{
			for(int j=i;j<=8;j++)
			{
				System.out.print("  \t");
			}
			for(int k=0;k<rowcount;k++)
			{
				int value=(int)(Math.pow(2,k));
				System.out.print("\t "+value);
			}
			for(int l=rowcount-2;l>=0;l--)
			{

				int value=(int)(Math.pow(2,l));
				System.out.print("\t "+value);

			}
			System.out.println();
			rowcount++;
		}


	}
}
