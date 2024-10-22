package InheritanceDemo;

public class MainCls extends ClassTwo
{
	public void div()
	{
		System.out.println("This method is from main class");
	}
	public static void main(String[] args) 
	{
		MainCls m1=new MainCls();
		m1.add();
		m1.sub();
		m1.div();
		m1.attend();
		
	}
}
