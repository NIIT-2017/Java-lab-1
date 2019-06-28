public class Circle {
    private double radius;
    private double ference;
    private double area;

    public void setRadius(double radius) {
        this.radius = radius;
        ference = 2*Math.PI*radius;
        area = Math.PI*radius*radius;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        radius = ference/(2*Math.PI);
        area = Math.PI*radius*radius;
    }

    public void setArea(double area) {
        this.area = area;
        radius = Math.sqrt(area/Math.PI);
        setRadius(radius);
    }

    public double getRadius() {return radius; }
    public double getFerence() {
        return ference;
    }
    public double getArea() {
        return area;
    }
}