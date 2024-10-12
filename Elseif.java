package Operators;

import java.util.Scanner;

public class Elseif 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		System.out.println("Enter the value of c");
		int c=s1.nextInt();
		
		if(a<b)
		{
			System.out.println("a is less than b if block");
		}
		else if(a<c)
		{
			System.out.println("a is less than c else if block");
		}
		else if(b<c)
		{
			System.out.println("b is less than c");
		}
		else
		{
			System.out.println("value is equal of a, b and c");
		}
		s1.close();
	}
}
