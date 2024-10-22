package Abstract;

public class GroTech extends GoogleAuth
{

	public void login()  
	{
		System.out.println("Login with Google API");
	}

	public void registration() 
	{
		System.out.println("Implement Google API");
	}
	public static void main(String[] args) 
	{
		GroTech g1=new GroTech();
		g1.login();
		g1.registration();
		method1();
		
	}

}
