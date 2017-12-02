
public class CircleDemo {
	public static void main(String[] args) {
		Circle cir = new Circle();
		double x=395.841096;
        cir.setFerence(x);
        System.out.println(cir.getArea());
        System.out.println(cir.getRadius());
        System.out.println(cir.getFerence());
	}
}
class Circle {
	private double pi = 3.141596;
	private double Radius;
	private double Ference;
	private double Area;
	
	public void setRadius(double Radius) {
		this.Radius = Radius;
	}
	
	public double getRadius() {
		if (Ference>0) {
			return Ference/(pi*2);
		}else return pi*(Math.sqrt(Area))/pi;
	}
	
	public void setFerence(double Ference) {
		this.Ference = Ference;
	}
	
	public double getFerence() {
		if (Radius>0) { 
		return pi*(2*Radius);
		}else return 2*pi*((Math.sqrt(Area))/pi);
		}
	
	public void setArea(double Area) {
		this.Area = Area;
	}
	
	public double getArea() {
		if (Radius>0) {
		return pi* Math.pow(Radius, 2);
		}else return pi* Math.pow(Ference/(pi*2), 2);
	}
	
}
