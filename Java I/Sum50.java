public class Sum50
{
	public static void main(String args[])
	{
		int x = 0;
		final int max = 50;
		for(int i = 1; i <= max; i++)
			x = x + i;	// or x += i;
		System.out.println("The total sum of integers between 1 to " + max + " is " + x);


	}
}
