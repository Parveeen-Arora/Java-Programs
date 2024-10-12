package static_NonStatic;

public class MethodOverloading 
{
	public static void addtion(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers :>"+c);
	}
	public static void addtion(int a, int b, int c)
	{
		 c=a+b;
		System.out.println("Addition of two number"+c);
	}
	public static void main(String[] args) 
	{
		addtion(10, 20);
		addtion(10, 10, 10);
	}
}
