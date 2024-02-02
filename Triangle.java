package HW13;
//Author: Ana Chambers
public class Triangle {
	double base;
	double height;
	
	public Triangle(double base_, double height_) {
		this.base = base_;
		this.height = height_;
	}
	//method for area
	public double area() {
		double a = .5 * base * height;
		return a;	
	}

}
