package InheritanceDemo;
class Fist
{
	public static void add()
	{
		System.out.println("Addition method is present in this");
	}
}

class Sec extends Fist
{
	public static void sub()
	{
		System.out.println("Subtraction method is present");
	}
}

public class MultiLevel extends Sec
{
	public static void div()
	{
		System.out.println("Division method is present");
	}
	public static void main(String[] args)
	{
		div();
		sub();
		add();
	}
}
