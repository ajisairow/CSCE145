
public class GenericMethods {

	private double addition(double x, double y)
	{
		//double z = x + y;
		//return z;
		
		return x + y;
	}
	
	private double areaofCircle(double radius)
	{
		//double pi = 3.14159;
		double area = Math.PI * Math.pow(radius, 2); 
		return area;
	}
	public static void main(String[] args) {
		GenericMethods g = new GenericMethods();
		
		
		
		System.out.println(g.addition(2, 3));
		
		//or
		
		double a = g.addition(2, 3);
		a = a + 2;
		System.out.println(a);
		
		System.out.println("This is pi: " + Math.PI);
		
		System.out.println(g.areaofCircle(7));
		System.out.println(g.areaofCircle(3));
		System.out.println(g.areaofCircle(12));
		System.out.println(g.areaofCircle(9));
	}
}