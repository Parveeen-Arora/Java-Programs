package IP_RunTime;

import java.util.Scanner;

//Find Area of circumference using Scanner Class
public class circumferenceOfCircle 
{
	public static void main(String[] args) 
	{
		System.out.println("value of pi is 3.14");
		double pi=3.14;
		Scanner c1=new Scanner(System.in);
		System.out.println("Enter the value of r ");
		double r=c1.nextDouble();
		double res=2*pi*r;
		System.out.println("Area of circumference is "+res);
		
	}
}
