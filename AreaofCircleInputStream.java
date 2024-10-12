package IP_RunTime;
import java.util.Scanner;
//Find Area of Circle using Scanner Class
public class AreaofCircleInputStream 
{
	public static void main(String[] args) 
	{
		System.out.println("Note- the value of pi is always 3.14");
		double pi=3.14;
		System.out.println("Enter the value of r ");
		Scanner a1=new Scanner(System.in);
		double r=a1.nextDouble();
		double result=pi*r*r;
		System.out.println("Area of Circle is "+result);
	}
}
