package static_NonStatic;

public class Non_staticCalledinMainMethod //Called 
{
	public void m1()
	{
		System.out.println("Method 1");
	}
	public void m2()
	{
		System.out.println("Method 2");
	}
	public void m3()
	{
		System.out.println("Method 3");
	}
	public static void m4()
	{
		System.out.println("Method 4 with static method");
	}
	
	public void m5()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{
		Non_staticCalledinMainMethod obj=new Non_staticCalledinMainMethod();
		obj.m1();
		obj.m2();
		obj.m1();
		m4();
		
	}

}
