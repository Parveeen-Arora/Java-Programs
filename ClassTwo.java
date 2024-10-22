package Abstract;

public class ClassTwo extends ClassOne {

	void method1() 
	{
		System.out.println("This is method 1");
	}

	void method2() 
	{
		System.out.println("This is method 2");
		
	}
	public static void main(String[] args) 
	{
		ClassTwo c1=new ClassTwo();
		c1.method1();
		c1.method2();
		c1.method3();
		
	}
	//Abstraction method implemented here and it will achieve 67% abstraction as here we have used 2 abstraction method and one is concrete method
	//Hello
	
	
	
	
	

}
