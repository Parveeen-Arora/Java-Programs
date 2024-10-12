package MathClass;
//Find the Area of circle using Math class
public class Area_of_circle 
{
	public static void main(String[] args) 
	{
		double pIvalue=Math.PI;
		double radius=Math.random();
		double area=pIvalue*radius*radius;
		System.out.println(area);
	}
}
