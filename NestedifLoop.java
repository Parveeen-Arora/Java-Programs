package Operators;
public class NestedifLoop 
{
	public static void main(String[] args) 
	{
		char gender1='M';
		char gender2='F';
		int age=13;
		{
			if(gender1=='M')
			{
				if(age>12)
				{
					System.out.println("Adult fare");
				}
				else
				{
					System.out.println("Half fare");
				}
			}
			else
			{
				System.out.println("Fare is free for females");
			}
		}
	}
}