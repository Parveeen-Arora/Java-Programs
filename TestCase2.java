package InheritanceDemo;

public class TestCase2 extends LaunchBrowser
{
	public void tc2()
	{
		System.out.println("Execting TC");
	}
	public static void main(String[] args) 
	{
		TestCase2 t2=new TestCase2();
		t2.launch();
		t2.tc2();
	}
}
