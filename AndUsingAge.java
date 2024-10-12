package Operators;
//WAP if the above is below 13 and if the age is above 60 than it will charge half fare
public class AndUsingAge 

{
	public static void main(String[] args) 
	{
		int age=3;
		if(age<=2 && age>=1)
		{
			System.out.println("free free free");
		}
		
		if(age<13 && age>2 )
		{
			System.out.println("than it will charge half fare");
		}
		if(age>=13 && age<60)
		{
			System.out.println("It will charge adult fare");
		}
		if(age>=60)
		{
			System.out.println("Senior citizen");
		}
	}	
}
