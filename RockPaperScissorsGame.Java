import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame
{
	public static void main(String[] args)
	{
		String[] computerHandArray = {"R", "S", "P"};
		String computerHand = "", thisWinner= "", theFinalWinner="";
		int index = 0;
		int timesIWon = 0;
		int timesComputerWon = 0;
		int timesTied = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter five choices(R/P/S):");
		
		for (int i=0; i<5; i++)
		{
			String myHandString = in.nextLine();
			
			String myHand = myHandString.substring(0,1);
			myHand = myHand.toUpperCase();
			
			index = (int)(Math.random () * 10) % 3;
			computerHand =computerHandArray[index];
			thisWinner = theWinnerOfOneGame(myHand, computerHand);
			
      //counter for the five rounds
			if (thisWinner.equals("ME"))
			{
				timesIWon++;
			}
			else if (thisWinner.equals("COMPUTER"))
			{
				timesComputerWon++;
			}
			else if (thisWinner.equals("TIE"))
			{
				timesTied++;
			}
		}
    
    //display final outcome and print
		if(timesIWon == timesComputerWon)
			theFinalWinner = "TIE";
		else if(timesIWon > timesComputerWon)
			theFinalWinner = "ME";
		else if(timesIWon < timesComputerWon)
			theFinalWinner = "COMPUTER";
		
		System.out.println("Game Over");
		System.out.println("Times you've won: " + timesIWon);
		System.out.println("Times the computer won: " + timesComputerWon);
		System.out.println("Times you've tied: " + timesTied);
		System.out.println("The final winner after the 5 games are: " + theFinalWinner);
	}
	private static String theWinnerOfOneGame (String myHand, String computerHand)
	{
	  //If we input the same
    String theWinner = "TIE";
		if (myHand.equals(computerHand))
			theWinner = "TIE";
      
		//If my input is Rock
		else if (myHand.equals("R"))
		{
			if (computerHand.equals("P"))
			{
				theWinner = "COMPUTER";
			}
			else if (computerHand.equals("S"))
			{
				theWinner = "ME";
			}
		}
    
		//If my input is Paper
		else if (myHand.equals ("P"))
		{
			if (computerHand.equals("S"))
			{
				theWinner = "COMPUTER";
			}
			else if (computerHand.equals("R"))
			{
				theWinner = "ME";
			}
		}
    
		//If my input is Scissors
		else if (myHand.equals ("S"))
		{
			if (computerHand.equals("R"))
			{
				theWinner = "COMPUTER";
			}
			else if (computerHand.equals("P"))
			{
				theWinner = "ME";
			}
		}
		return theWinner;
	}
}
