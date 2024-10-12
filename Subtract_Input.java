package IP_RunTime;

import java.util.Scanner;

public class Subtract_Input 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter value of p");
		Scanner s1=new Scanner(System.in);
		int p=s1.nextInt();
		System.out.println("Enter value of k");
		int k=s1.nextInt();
		int sub=p-k;
		System.out.println("Subtract of two numbers is "+sub);
	}
}
