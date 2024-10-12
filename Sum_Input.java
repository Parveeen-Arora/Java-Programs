package IP_RunTime;
import java.util.Scanner;
public class Sum_Input 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter value of p ");
		Scanner s1=new Scanner(System.in);
		int p=s1.nextInt();
		System.out.println("Enter value of m ");
		int m=s1.nextInt();
		int sum=p+m;
		System.out.println("Sum of two numbers are "+sum);
	}
}
