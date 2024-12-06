
public class Main {

	//Animal class
	//2 sub classes, car and dog
	//	Cat: Name, age. furBallCount
	// Dog: Name, age, ballLocation
	
	public static void main(String[] args) {
		Animal a = new Animal("Fido", 3);
		Animal b = new Animal("Fido", 3);
		
		System.out.println(a.equals(b));
		
		Cat c = new Cat("Meow", 5, 3);
		Cat d = new Cat("Ash", 7, 20);
		
		System.out.println(c.equals(d));
		System.out.println(c);
		System.out.println(d);
	}
}
