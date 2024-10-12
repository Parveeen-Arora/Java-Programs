package Constructor;
public class Multiple_MainMethods 
{
	public static void main(String[] args) 
	{
		main("Parveen Arora", 'M');
		Multiple_MainMethods mp1=new Multiple_MainMethods();
		mp1.m1();
		mp1.m1("Hello");
		System.out.println("Thank you very much");
	}
	public static void main(String name, char gender) 
	{
		System.out.println("My name is "+name);
		System.out.println("Gender :> "+gender);
		System.out.println("Welcome to my slide");
	}
	void m1()
	{
		System.out.println("This method is default method");
		System.out.println("This is non static method");
		System.out.println("The method name is m1");
	}
	static void m1(String s1)
	{
		System.out.println("non-static method");
	}
}
