package IP_RunTime;

import java.util.Scanner;

public class AreaofRectangle 
{
	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter Lenth");
		int l=a1.nextInt();
		System.out.println("Enter Breadth");
		int b=a1.nextInt();
		int res=l*b;
		System.out.println("Area of rectangle is "+res);
		a1.close();
	}
}
