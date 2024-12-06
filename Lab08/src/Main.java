//Ronan Param


public class Main {

	public static void main(String[] args) {
		System.out.println("Inheritance");
		
		System.out.println();
		
		Shape n1 = new Shape();
		Shape n2 = new Shape("Cat");
		Shape n3 = new Shape("Cat");
		Shape n4 = new Shape("Dog");
		
		Rectangle x1 = new Rectangle();
		Rectangle x2 = new Rectangle("Rectangle",3,4);
		Rectangle x3 = new Rectangle("Rectangle",3,4);
		Rectangle x4 = new Rectangle("Rectangle",2,2);
		
		//Area
		System.out.println("Area method");
		System.out.println("The area of each shape from 1 to 4");
		System.out.println(n1.getName() +"area ="+n1.area());
		System.out.println(n2.getName() +"area ="+n2.area());
		System.out.println(n3.getName() +"area ="+n3.area());
		System.out.println(n4.getName() +"area ="+n4.area());
		
		System.out.println();
		
		System.out.println("toString methods of each shape");
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());
		System.out.println(n4.toString());
		
		System.out.println();
		
		System.out.println("toString methods of each rectangle");
		System.out.println(x1.toString());
		System.out.println(x2.toString());
		System.out.println(x3.toString());
		System.out.println(x4.toString());
		
		//Equals
		
		System.out.println();
		
		System.out.println("Equal method");
		System.out.println(n1.getName() + " equals " + n1.getName() + ": " + n1.equals(n2));
		System.out.println(n2.getName() + " equals " + n2.getName() + ": " + n3.equals(n3));
		System.out.println(n3.getName() + " equals " + n3.getName() + ": " + n3.equals(n4));
		System.out.println(x1.getName() + " equals " + x1.getName() + ": " + x1.equals(x2));
		System.out.println(x2.getName() + " equals " + x2.getName() + ": " + x2.equals(x3));
		System.out.println(x3.getName() + " equals " + x3.getName() + ": " + x3.equals(x4));
	}
}
