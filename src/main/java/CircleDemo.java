public class CircleDemo{
	public static void main(String args[]) {
		

		//Earth radius = 6378.1 km
		double rad = 6378.1;
		//radius = 6378.1, circumference = 40074.78420772212, area = 1.2780049057763624E8
		Circle c = new Circle(rad);
		//initial radius(ir)
		double ir = c.getRadius();
		//radius = 6378.259154943093, circumference = 40075.78420772212, area = 1.2780686875721373E8
		c.setFerence(c.getFerence() + 1);
		//modified radius
		double mf = c.getRadius();
		
		//their difference
		double diff = mf - ir;
		System.out.println(Circle.round(diff, 2));
		System.out.println("------------------");

		

		//concrete price is 1000
		double concrete = 1000;
		//fence price is 2000
		double fence = 2000;
		//pool radius = 5 m
		c.setRadius(3);
		
		System.out.println(c.getRadius());
		System.out.println(c.getFerence());
		System.out.println(c.getArea());
		//pool area
		double area1 = c.getArea();
		//pool + fence
		c.setRadius(4);
		double area2 = c.getArea();
		
		double concretePrice = (area2 - area1) * concrete;
		double fencePrice = c.getFerence() * 2000;
		
		System.out.println("Concrete price is: " + concretePrice);
		System.out.println("fencePrice is " + fencePrice);
		//pool with road
	}
}

class Circle{
	
	//TODO Properties
	private double radius;
	private double ference;
	private double area;
	
	
	//TODO Constructors
	
	public Circle(double radius) {
		this.radius = radius;
		this.ference = calculateFerence(this.radius);
		this.area = calculateArea(this.radius);
		
	}
	
	public Circle() {
		this(0);
	}
	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.ference = calculateFerence(this.radius);
		this.area = calculateArea(this.radius);
	}
	public double getFerence() {
		return ference;
	}

	public void setFerence(double ference) {
		this.ference = ference;
		this.radius = this.ference / (2 * Math.PI);
		this.area = calculateArea(this.radius);
	}
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
		this.radius = Math.sqrt(this.area / Math.PI);
		this.ference = calculateFerence(this.radius);
	}
	
	//TODO Static methods

	static double calculateFerence(double radius) {
		return 2 * Math.PI * radius;
	}

	static double calculateArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	static double round(double v, int p) {
		int s = (int) Math.pow(10, p);
		return (double) Math.round(v * s) / s;
	}
}
