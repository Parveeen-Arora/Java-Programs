package datatype;

public class NonStaticValue
{
	int a=10;
	static int b=10;
	public static void main(String[] args) 
	{
		NonStaticValue n1=new NonStaticValue();
		n1.a=20;
		System.out.println(n1.a);
		m0();
		m1();
		m2();
		
	}
	public static void m0()
	{
		System.out.println("This is m0 value "+ b);
	}
	public static void m1()
	{
		b=15;
		System.out.println(b);
	}
	public static  void m2()
	{
		System.out.println(b);
	}
}
