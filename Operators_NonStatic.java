package static_NonStatic;

public class Operators_NonStatic 
{
	void addtion()
	{
		int a=6;
		int b=7;
		int sum=a+b;
		System.out.println("Sum of two numbers is :> "+sum);
	}
	void subtraction()
	{
		int a=10;
		int b=6;
		int sub=a-b;
		System.out.println("Subtraction of two numbers :> "+sub);
	}
	void multiplication()
	{
		int a=6;
		int b=7;
		int m=6*7;
		System.out.println("Muliplication of two numbers :> "+m);
	}
	void division()
	{
		int a=27;
		int b=3;
		int d=a/b;
		System.out.println("Division of two numbers :> "+d);
		
	}
	void modules()
	{
		int a=10;
		int b=3;
		int m=a%b;
		System.out.println("Modules of two numbers :> "+m);
	}
	
	public static void main(String[] args) 
	{
		Operators_NonStatic O1=new Operators_NonStatic();
		O1.addtion();
		O1.subtraction();
		O1.multiplication();
		O1.division();
		O1.modules();
	}
}
