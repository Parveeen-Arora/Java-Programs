package Constructor;
public class Constructor_1 
{
	Constructor_1()
	{
		System.out.println("Hello");
	}
	Constructor_1(int a)
	{
		System.out.println("Constructor with method overloading "+a);
	}
	public static void main(String[] args)
	{
		new Constructor_1(); //1st types to create method without help any reference variable
		Constructor_1 c1=new Constructor_1(100); //object created with the help of reference variable
	}
}
