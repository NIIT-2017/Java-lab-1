import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

    public class Circle {

    private double ference, area, radius;

    public Circle() {
        this.ference = 11.0;
        this.area = 10.0;
        this.radius = 1.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = PI * radius * radius;
        this.ference = 2 * PI * radius;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = sqrt(area / PI);
        this.ference = 2 * PI * this.radius;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = ference / (2 * PI);
        this.area = (ference * ference) / (4 * PI);
    }

    public double getArea() {
        return this.area;
    }

    public double getFerence() {
        return this.ference;
    }

    public double getRadius() { return this.radius; }
}

