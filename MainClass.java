package Abstract;
public class MainClass extends ABClass
{
	void m1() 
	{
		System.out.println("Method 1");
	}
	
	void m2() 
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) 
	{	
		MainClass m11=new MainClass();
		m11.m1();
		m11.m2();
		m3();
	}
}
