//Ronan Param
public class Shape {
	private String name;
	public Shape() {
		name = "Blank";
	}
	public Shape(String shapeName) {
		this.name = shapeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double area() {
		return 0;
	}
	
	public String toString() {
		return "The area of the " +this.name+ " is " + this.area();
	}
	
	public boolean equals(Shape that) {
		if(this.name == that.name) {
			return true;
		} else {
			return false;
		}
	}
}
