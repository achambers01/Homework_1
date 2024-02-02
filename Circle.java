package HW18;
//Author: Ana Chambers
public class Circle {
	double radius;
	
	public Circle(double radius_) {
		this.radius = radius_;
	}
	//method for area
	public double area() {
		double a = 3.1415 * radius * radius;
		return a;		
	}

}
