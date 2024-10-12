package static_NonStatic;

public class OperatorStatic_Overloading 
{
	public static void subtraction(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction of two numbers is :> "+c);
	}
	public static void subtraction(float a, float b)
	{
		float c=a-b;
		System.out.println("Subtraction of two numbers is :> "+c);
	}
	public static void main(String[] args) 
	{
		subtraction(10, 7);
		subtraction(10.7f, 2.0f);
	}
}
