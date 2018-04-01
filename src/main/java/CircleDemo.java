/**
 * Created by khvostovai on 27.03.2018.
 */
public class CircleDemo {

    private double radius=0.0,ference=0.0,area=0.0;

    public CircleDemo(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getFerence() {
        return ference;
    }

    public double getArea() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius  = radius;
        this.ference = Math.PI*2*radius;
        this.area    = Math.PI*radius*radius;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius  = ference/(2*Math.PI);
        this.area    = this.radius*this.radius*Math.PI;
    }

    public void setArea(double area) {
        this.area    = area;
        this.radius  = Math.sqrt(area/Math.PI);
        this.ference = this.radius*2*Math.PI;
    }
}
