import java.util.*;
import java.lang.reflect.*;
public class runnNumbers
{
	private static int howMuchToCount;
	int nums[] = {3,5,15,20};
	String text[] = {"Fizz", "Fuzz", "FizzFuzz", "Buzz"};
	
	
	
	
	
	runnNumbers(int howMuch){
		this.howMuchToCount = howMuch;
	}
	
	public void setChange(int numberToChange, String whatToWrite){
		
	}
	
	public void run()
	{
	
		
		for (int i = 1; i <= howMuchToCount; i++)
		{for(int b = 0; b < nums.length; b++)
			{ 
			if(i%nums[b]==0)
				{
				System.out.println(text[b]);
				}
			
			}
			System.out.println(i);
			
		}
	}
}
