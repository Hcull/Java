public class ProjectedSales
{
	public static void main(String[] args)
	{
		final double INCREASE = 0.10;
		int northSales = 4000;
		int southSales = 5500;
		double northProjection;
		double southProjection;
		
		northProjection = northSales + northSales * INCREASE;
		southProjection = southSales + southSales * INCREASE;
		
		System.out.println("The projected sales for the North Division: " + northProjection);
		System.out.println("The projected sales for the South Division: " + southProjection);
	}
}
