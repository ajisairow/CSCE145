
public class classes {

//Method test
//Scope
//(static)
//return type
//identifier
//parameters, arguments
	public static void main(String[] args)
	{
	//If method isn't static, need to make an instance first.
	classes classes = new classes();
	
	classes.start();
	//classes.printOne();
	}
	
	public void start()
	{
		printOne();
		System.out.println("start");
	}

	public void printOne()
	{
		printTwo();
		System.out.println("One");
	
	}
	
	public void printTwo()
	{
	printThree();
	System.out.println("Two");
	}
	
	public void printThree()
	{
		System.out.println("Three");
		
	}
}