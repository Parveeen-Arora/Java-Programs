package static_NonStatic;

public class StaticMethodAddition 
{
	public static void Addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Additon of two numbers is :> "+sum);
	}
	
	public static void Subtraction()
	{
		int a=10;
		int b=20;
		int sub=b-a;
		System.out.println("Additon of two numbers is :> "+sub);
	}
	public static void Multiplication()
	{
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println("Additon of two numbers is :> "+mul);
	}
	public static void division()
	{
		int a=10;
		int b=20;
		int div=b/a;
		System.out.println("Additon of two numbers is :> "+div);
	}
	public static void modules()
	{
		int a=10;
		int b=21;
		int reminder=b%a;
		System.out.println("Additon of two numbers is :> "+reminder);
	}
	
	public static void main(String[] args) 
	{
		Addition();
		Subtraction();
		Multiplication();
		division();
		modules();
		
	}
}
