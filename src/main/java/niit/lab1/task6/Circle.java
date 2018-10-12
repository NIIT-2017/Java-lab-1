package niit.lab1.task6;

public class Circle {
    private double radius; // радиус
    private double ference; // длина окружности C = 2πr
    private double area; // площадь круга A = πr2 или A = π(d/2)2

    public Circle(double radius, double ference, double area) {
        this.radius = radius;
        this.ference = ference;
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.setFerence(2*Math.PI*this.getRadius());
        this.setArea(Math.PI*Math.pow(this.getRadius(),2));
    }

    public double getFerence() {
        return ference;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = this.getFerence()/(2*Math.PI);
        this.area = Math.PI*Math.pow(this.getRadius(),2);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(this.getArea()/Math.PI);
        this.ference = 2*Math.PI*this.getRadius();
    }
}
