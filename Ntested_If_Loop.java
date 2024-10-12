package Operators;

import java.util.Scanner;

public class Ntested_If_Loop 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter age");
		int age=s1.nextInt();
		System.out.println("Enter weight");
		int weight=s1.nextInt();
		
		if(age>17)
		{
			if(weight>49)
			{
				System.out.println("You can donate your blood");
			}
			else
			{
				System.out.println("You are not eligible for blood donation");
			}
		}
		else
		{
			System.out.println("You are not eligible for blood donation");
		}
	}
}
