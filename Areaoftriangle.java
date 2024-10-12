package IP_RunTime;

import java.util.Scanner;

//0.5*b*h
public class Areaoftriangle 
{
	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		int b=a1.nextInt();
		System.out.println("Enter value of b ");
		int h=a1.nextInt();
		System.out.println("Enter value of h");
		int res=(int) (b*h*0.5);
		System.out.println("Area of Triangle is "+res);
		
	}
}
