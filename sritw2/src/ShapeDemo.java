class Shape{
	void draw() {
		System.out.println("Drawing shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing circle");
	}
}
class Rectangle2 extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing Triangle");
	}
}
public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shape= {new Circle(),new Rectangle2(),new Triangle()};
		for(Shape s: shape) {
			s.draw();
		}
	}
}
