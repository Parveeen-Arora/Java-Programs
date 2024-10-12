package Operators;

import java.util.Scanner;

public class OR_Operator
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		
		if(a<b || a==10)
		{
			System.out.println("this condition is 1st");
		}
		if(a>b || a!=b)
		{
			System.out.println("This is 2nd condition");
		}
		
		
	}
}
