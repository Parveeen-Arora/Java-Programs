package Operators;

import java.util.Scanner;

public class If_Condition 
{
	public static void main(String[] args) 
	{
		Scanner i1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=i1.nextInt();
		System.out.println("Enter the value of b");
		int b=i1.nextInt();
		if(a<b)
		{
			System.out.println(b+" is greater than "+a);
		}
		i1.close();
	}
}
