package InheritanceDemo;

class One
{
	One()
	{
		System.out.println("This is constructor one");
	}
}

class Two extends One
{
	Two()
	{
		System.out.println("This is constructor two");
	}
}


public class Contructor_Class extends Two
{
	Contructor_Class()
	{
		System.out.println("Main class constructor");
	}
	public static void main(String[] args) 
	{
		new Contructor_Class();
	}

}
