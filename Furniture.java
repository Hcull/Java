import java.util.*;

public class Furniture
{
    public static void main(String[] args)
    {
    int selection;
    int price;
    String result;

    Scanner in = new Scanner(System.in);
    System.out.println("\tMenu\n\n(1) Pine\n(2) Oak\n(3) Mahogany" +  "\n\nEnter selection: (1, 2, or 3): ");

    selection = in.nextInt();

    if(selection == 1)
    {
		result = "\nPine table";
         price = 225;
        System.out.println("You've Selected: Pine Table-$100");
    }
else
      if(selection == 2)
      {
          result = "\nOak table";
          price = 225;
		  System.out.println("You've Selected: Oak Table-$225");
      }
  
     else
        if(selection == 3)
        {
            result = "\nMahogany table";
            price = 350;
			System.out.println("You've Selected: Mahogany Table-$350");
    
        }
	else
        if(selection == 0)
        {
            result = "None";
            price = 0;
			System.out.println("You've Selected: None. Have a nice day!");
    
        }
    }
}