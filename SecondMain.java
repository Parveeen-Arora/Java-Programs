package InheritanceDemo;
//WAP of single level inheritance (Another class is First) with the non-static methods
import java.util.Scanner;

public class SecondMain extends First
{
	Scanner s1=new Scanner(System.in);
	public void mul()
	{
		System.out.println("Multiply");
		System.out.println("Enter the value of k");
		int k=s1.nextInt();
		System.out.println("Enter the value of p");
		int p=s1.nextInt();
		 
		int o=k*p;
		
		System.out.println("Multiplication is p*k : "+o);
		
	}
	
	public void div()
	{
		System.out.println();
		System.out.println("Division");
		System.out.println("Enter the value of x");
		int x=s1.nextInt();
		System.out.println("Enter the value of y");
		int y=s1.nextInt();
		 
		int z=x/y;
		
		System.out.println("Division is p/k : "+z);
		
	}
	public static void main(String[] args) 
	{
		SecondMain p1=new SecondMain();
		p1.mul();
		p1.add();
		p1.sub();
		p1.div();
	}
}
