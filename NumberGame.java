import java.util.*;
class Check 
{
    static int win=0;
	Check()
	{
		
        Random sc = new Random();
		Scanner sc1 = new Scanner(System.in);
		int random = sc.nextInt(1,100);
		System.out.println("YOU HAVE 10 CHANCES");
		int count = 1;
		while(count < 10)
		{
            System.out.print("Enter your guess:");
	        int guess = sc1.nextInt();
	        if(guess == random)
	        {
	        	System.out.println("CONGRATS!! Your guess is correct");
	        	win=win+1;
	        	System.out.println("\n-----You won "+win+" time(S)-----\n");
	        	break;
                
	        }
	        else if(guess < random)
	        {
	        	System.out.println("Your guess is too low");
	        	count++;
	        }
	        else
	        {
	        	System.out.println("Your guess is too high");
	        	count++;
	        }

	       
		}

		
	}
	
}
public class NumberGame extends Check{


	public static void main(String args[])
	{
		System.out.println("\n============================================================================================================\n\t\t\t\t\t\t\tNUMBER GAME\n============================================================================================================\n");
        int round=0;
		Scanner sc2 = new Scanner(System.in);
		int run=1;
		while(run!=0)
		{
		round = round+1;	
		System.out.println("\n----------You are in round number "+round+"----------\n");
        Check o = new Check();
        System.out.println("Enter 0 to quit else enter any number");
        run=sc2.nextInt();
        }

	}

}
