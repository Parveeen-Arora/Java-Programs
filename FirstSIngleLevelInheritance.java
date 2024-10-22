package InheritanceDemo;
public class FirstSIngleLevelInheritance extends Second
{
	public void add()
	{
		System.out.println("Add");
	}
	public void sub()
	{
		System.out.println("Sub");
	}
	public static void main(String[] args) 
	{
		FirstSIngleLevelInheritance f1=new FirstSIngleLevelInheritance();
		f1.add();
		f1.sub();
		f1.div();
		f1.mul();
	}
}
