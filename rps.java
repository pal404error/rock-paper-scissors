import java.util.Scanner;
import java.util.Random;
public class rps
{
	public static void main(String []args)
	{
		System.out.print("\n \t WELCOME TO ROCK PAPER SCISSORS \n \n \n \t CHOOSE : \n \n \t 0.ROCK \n \t 1.PAPER \n \t 2.SCISSORS \n \t ENTER : ");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		Random r = new Random();
		int bot = r.nextInt(2);
		System.out.print("\n \t BOT CHOOSES " +bot);
		switch(choice)
		{
			case 0 :
			if ( bot == 0)
			{
				System.out.println("\n \t OH NO TIED ");
			}
			else if (bot == 1)
			{
				System.out.println("\n \t BOT CHOOSES PAPER,BEATS YOU ");
			}
			else if (bot == 2)
			{
				System.out.println("\n \t BOT CHOOSES SCISSORS, YOU BEATEN THE BOT ");
			}
			break;
			case 1 :
			if ( bot == 0)
			{
				System.out.println("\n \t BOT CHOOSES ROCK, YOU BEATEN THE BOT "); 
			}
			else if (bot == 1)
			{
				System.out.println("\n \t OH NO TIED ");
				
			}
			else if (bot == 2)
			{
				System.out.println("\n \t BOT CHOOSES SCISSORS, BEATS YOU ");
			}
			break;
			
			case 2 :
			if ( bot == 0)
			{
				System.out.println("\n \t BOT CHOOSES ROCK , BEATS YOU ");
				 
			}
			else if (bot == 1)
			{
				
				System.out.println("\n \t BOT CHOOSES PAPER , YOU BEATEN THE BOT ");
			}
			else if (bot == 2)
			{
				System.out.println("\n \t OH NO TIED ");
				
				
			}
			break;
			
			default :
			{
				System.out.println("\n \t ENTER VALID CHOICE TRY AGAIN");
				java.lang.System.exit(0);
			}
			break;
	}
}
}
		
		
