interface Shape{
	
	abstract double area();
}

class Rectangle7 implements Shape{
	double l,b;
	Rectangle7(double l, double b){
		this.l=l;
		this.b=b;
	}
	double area2() {
		return l*b;
	}
}
class Circle6 implements Shape{
	double r;
	Circle6(double r){
		this.r=r;
	}
	double area2() {
		return Math.PI*r*r;
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
			Rectangle7 r=new Rectangle7(12,5);
			System.out.println("Area of Rectangle: "+r.area());
			Circle6 c=new Circle6(12.5);
			System.out.println("Area of Circle:"+c.area());
	       }
		}