package InheritanceDemo;
//This Program is single level inheritance with the static methods
public class SingleLevel extends MainClass
{
	public static void add()
	{
		System.out.println("Add two no's");
	}
	public static void sub()	
	{
		System.out.println("Subtract of two no's");
	}
	 public static void main(String[] args)
	 {
		 add();
		 sub();
		 div();
		 mul();
	 }

}

class MainClass
 {
	public static void div()
	{
		System.out.println("Division");
	}
	public static void mul()
	{
		System.out.println("Multiplication");
	}
 }

