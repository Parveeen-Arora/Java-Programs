package datatype;

import java.util.Scanner;

public class StaticBoolean 
{
	static boolean Parveen;
	public static void main(String[] args)
	{	
		Parveen=false;
		System.out.println(Parveen);
		System.out.println("Enter value in boolean");
		Scanner s1=new Scanner(System.in);
		boolean Parveen=s1.nextBoolean();
		System.out.println(Parveen);
		s1.close();
	}
}
