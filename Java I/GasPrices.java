import java.util.Scanner;
public class GasPrices
{
	public static void main (String[] args)
	{
		int pricePerBarrel = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the current gas price per barrel >>");
		pricePerBarrel = input.nextInt();
		calculatePricePerGallon(pricePerBarrel);
	}
	public static void calculatePricePerGallon(int ppb)
	{
		final double LOW = 3.50;
		final double HIGH = 4.00;
		final double BASE = 100;
		
		double lowPPG = ppb/BASE * LOW;
		double highPPG = ppb/BASE * HIGH;
		System.out.println("when gas is " + ppb + " per barrel, than is price is from " + lowPPG + " is " + highPPG + " per gallon");
	}
}

