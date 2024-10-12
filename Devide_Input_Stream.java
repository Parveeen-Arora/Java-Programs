package IP_RunTime;

import java.util.Scanner;

public class Devide_Input_Stream 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a");
		Scanner d1=new Scanner(System.in);
		int a=d1.nextInt();
		System.out.println("Enter the value of b");
		int b=d1.nextInt();
		int devide=a/b;
		System.out.println("Devision of two are numbers are "+devide);
		
	}
}
