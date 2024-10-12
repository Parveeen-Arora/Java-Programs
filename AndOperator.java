package Operators;

public class AndOperator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		if(a==b && a==10)
		{
			System.out.println("Condition is false");
		}
		if(a<b && a==10)
		{
			System.out.println("This condition is true");
		}
	}
}
