package datatype;

import java.util.Scanner;

public class Final_AreaofCircle 
{
	 static final double pi=3.14;
	 static void Area()
	 {
		 Scanner f1=new Scanner(System.in);
		 System.out.println("Enter the value of r");
		 int r=f1.nextInt();
		 System.out.println("Value of pi is "+pi);
		 System.out.println("Area of Circle is (pi*r*r) "+pi*r*r);
		 
	 }
	 public static void main(String[] args) 
	 {
		Area();
	}
	
}
