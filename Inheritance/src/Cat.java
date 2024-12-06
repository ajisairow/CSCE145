
public class Cat extends Animal{
	private int furBallCount;

	public Cat()
	{
		//this is the calling Animals constructor
		super();
		this.furBallCount = 0;
	}
	
	public Cat(String name, int age, int furBallCount)
	{
		super(name, age);
		this.furBallCount = furBallCount;
	}
	public int getFurBallCount()
	{
		return furBallCount;
	}
	public void setFurBallCount(int furBallCount) 
	{
		this.furBallCount = furBallCount;
	}
	public String toString()
	{
		return super.toString() + ", " + this.furBallCount;
	}
	public boolean equals(Cat c)
	{
		return c != null
				&& getFurBallCount() == c.getFurBallCount()
				&& super.equals(c);
	}
}
