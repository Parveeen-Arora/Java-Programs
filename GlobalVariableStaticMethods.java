package datatype;

public class GlobalVariableStaticMethods 
{
	static int a=20;
	static int b=10;
	static int res;
	static void add()
	{
		res=a+b;
		System.out.println("Addition of two no's "+res);
	}
	static void sub()
	{
		res=a-b;
		System.out.println("Subtraction of two no's "+res);
	}
	static void mul()
	{
		res=a*b;
		System.out.println("multipilication of two no's "+res);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
	}
}
