package Keywords;

import java.util.Scanner;

public class Switch_Case 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any value");
		Scanner s1=new Scanner(System.in);
		int i=s1.nextInt();
		switch (i)
		{
			case 1:
			System.out.println("Launching Chrome Browsers");
			break;
			
			case 2:
			System.out.println("Launching Edge Browser");
			break;
			
			case 3:
			System.out.println("Launching Safari Browser");
			break;
			
			case 4:
			System.out.println("Launching Firefox");
			break;
	
	default:
			System.out.println("Invalid input");
		}	
		s1.close();
	}
}
