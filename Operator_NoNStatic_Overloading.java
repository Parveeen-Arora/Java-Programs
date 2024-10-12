package static_NonStatic;

public class Operator_NoNStatic_Overloading 
//Operators with static method by using method overloading concepts
{
	public void addtion(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers:> "+c);
	}
	public void additon(double a, double b)
	{
		double c=a+b;
		System.out.println("Addition of two numbers :> "+c);
	}
	public void addtion(String s, char c)
	{
		System.out.println("My name is "+s);
		System.out.println("Gender :> "+c);
	}
	public static void main(String[] args)
	{
		Operator_NoNStatic_Overloading O1=new Operator_NoNStatic_Overloading();
		O1.addtion(6, 7);
		O1.additon(23.3, 24.4);
		O1.addtion("Parveen", 'M');
	}
}
