public class Die
{
	private int randomvalue;
	
	public Die()
	{
		randomvalue = ((int)(Math.random() * 100)%6 + 1);
	}
	public int getvalue()
	{
		return randomvalue;
	}
}
