
public class Animal {

	private String name;
	private int age;
	
	public Animal()
	{
		this.name = "";
		this.age = 0;
	}
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age =  age;
	}
	public String toString()
	{
		return this.name + ", " + this.age;
	}
	public boolean equals(Animal a)
	{
		return this.age == a.getAge()
				&& this.name.equals(a.getName());
	}
}
