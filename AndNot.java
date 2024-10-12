package Operators;

public class AndNot 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		if(!(a<b && a!=b))
		{
			System.out.println("False");
		}
		if(!(a>b && a==b))
		{
			System.out.println("True because the condition is false");
		}
		
	}
}
