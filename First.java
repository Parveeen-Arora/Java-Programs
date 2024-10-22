package InheritanceDemo;

import java.util.Scanner;

//WAP of inheritance of (Class name is second) with non-static methods
public class First 
{
	Scanner s1=new Scanner(System.in);
	public void add()
	{
		System.out.println();
		System.out.println("Add");
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("Sum of a and b is : "+c);
	}
	public void sub()
	{
		System.out.println();
		System.out.println("Subtraction");
		System.out.println("Enter the value m");
		int m=s1.nextInt();
		System.out.println("Enter the value of p");
		int p=s1.nextInt();
		
		int q=m-p;
		System.out.println("Subtraction of two numbers is : "+q);		
	}
}
