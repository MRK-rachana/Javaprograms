abstract class Shape1{
	String color;
	abstract double area();
	
	void display() {
		System.out.println("color: " + color);
	}
	
}
class Circle1 extends Shape1 {
	double radius;
	Circle1(double radius)
	{
		this.radius=radius;
	}
	double area() {

		return Math.PI*radius * radius;	
	}
	
}
public class Abstract_Class {
	
	public static void main(String[] args) {
		Circle1 c=new Circle1(12.50);
		System.out.println("Circle1 Area: "+c.area());
		c.display();
	}

}
