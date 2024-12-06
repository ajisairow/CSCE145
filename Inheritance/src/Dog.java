
public class Dog extends Animal{
	private String ballLocation;
	
	public Dog() 
	{
		super();
		this.ballLocation = "";
	}
	public Dog(String name, int age, String ballLocation) 
	{
		super(name, age);
		this.ballLocation = ballLocation;
	}
	//Right click, Source, Generate Getters and Setters
	
	public String getBallLocation() {
		return ballLocation;
	}
	
	public void setBallLocation(String ballLocation) {
		this.ballLocation = ballLocation;
	}
public String toString() 
{
	return super.toString() + "," + getBallLocation();
	
}
public boolean equals(Dog d)
{
	return d != null
			&& d.getBallLocation().equals(getBallLocation())
			&& super.equals(d);
	}
	
}
