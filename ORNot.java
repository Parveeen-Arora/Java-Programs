package Operators;

public class ORNot 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
		
		if(!(a<b || a==b))
		{
			System.out.println("This condition is false but due to not operator it will be reverse to true");
		}
	}
}
