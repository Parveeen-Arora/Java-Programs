package Operators;

public class NestedifElse 
{
	public static void main(String[] args) 
	{
		
		int a=13;
		if(a%2==0)
		{
			if(a%6==0)
			{
				System.out.println("Even number");
			}
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}