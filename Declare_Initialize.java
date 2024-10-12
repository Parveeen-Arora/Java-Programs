package IP_RunTime;
import java.util.Scanner;
//WAP to declare and initialize each methods of scanner class or
//WAP to initialize the value of each methods in the scanner class.  
public class Declare_Initialize 
{
	public static void main(String[] args)
	{
		Scanner d1=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=d1.next();
		System.out.println("Enter weight in flot");
		float weight=d1.nextFloat();
		System.out.println("Your Last name is Arora");
		boolean lastName=d1.nextBoolean();
		System.out.println("Enter your age");
		byte age=d1.nextByte();
		System.out.println("Enter your age in days");
		short agedays=d1.nextShort();
		System.out.println("Enter value in long");
		long l1=d1.nextLong();
		d1.close();
		
		System.out.println("Your name is "+name);

		System.out.println("Your weight is "+weight);
		System.out.println("Your last name is "+lastName);
		System.out.println("Your age is "+age);
		System.out.println("Your name is "+agedays);
		System.out.println("Your name is "+l1);
	}
}
