package HW110;
//Author: Ana Chambers
public class Rectangle {
	double length;
	double width;
	
	public Rectangle(double length_, double width_) {
		this.length = length_;
		this.width = width_;		
	}
	//method for area
	public double area() {
		double a = length * width;
		return a;
	}
	//method for perimeter
	public double perimeter() {
		double p = (2*length) + (2*width);
		return p;
	}

}
