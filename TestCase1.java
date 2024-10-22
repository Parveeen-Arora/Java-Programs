package InheritanceDemo;

public class TestCase1 extends LaunchBrowser
{
	public void tc()
	{
		System.out.println("Executing test case");
	}
	public static void main(String[] args) 
	{
		TestCase1 t1=new TestCase1();
		t1.launch();
		t1.tc();
	}
	
}
