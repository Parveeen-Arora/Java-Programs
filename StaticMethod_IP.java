package datatype;

import java.util.Scanner;

//WAP to make 5 static methods and give the input using scanner class
public class StaticMethod_IP 
{
	static Scanner s1=new Scanner(System.in);
	static void add()
	{
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		System.out.println("Sum of two numbers is "+(a+b));
	}
	static void sub()
	{
		System.out.println("Enter the value of x");
		int x=s1.nextInt();
		System.out.println("Enter the value of b");
		int y=s1.nextInt();
		System.out.println("Subtraction of two numbers is "+(x-y));
		
	}
	public static void main(String[] args) 
	{
		add();
		sub();
	}
}
