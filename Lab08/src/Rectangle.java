//Ronan Param
public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(String name, double l, double w) {
		super(name);
		this.length = l;
		this.width = w;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setWidth(double w) {
		this.width = w;
	}
	
	public double getWidth() {
		return this.width;
	}
	@Override
	public double area() {
		return this.length * this.width;
	}
	
	public String toString() {
		return super.toString() + ", length is" +this.length+", width is "+this.width;
	}
	public boolean equals(Rectangle that) {
		if(this.length == that.length && this.width == that.width) {
			return true;
		} else {
			return false;
			
		}
	}

}
