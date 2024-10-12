package Operators;

public class If__Condition 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		if(a<b) //True
		{
			System.out.println("B");
		}
		if(a>b) //False
		{
			System.out.println("A");
		}
		if(a<=b) //True
		{
			System.out.println("A is greater than B");
		}
		if(a>=b) //False
		{
			System.out.println("A is less than B");
		}
		if(a==b) //False
		{
			System.out.println("A equals to B");
		}
		if(a!=b) //True
		{
			System.out.println("A is not equal to B");
		}
	}
}
