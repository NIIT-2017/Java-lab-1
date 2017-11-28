public class Circle {

    private double Radius;
    private double Ference;
    private double Area;


    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
        Ference = Math.PI*2*Radius;
        Area = Math.PI*Radius*Radius;
    }

    public double getFerence() {
        return Ference;
    }

    public void setFerence(double ference) {
        Ference = ference;
        Radius = Ference/(Math.PI*2);
        Area = Math.PI*Radius*Radius;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
        Radius = Math.sqrt(Area/Math.PI);
        Ference = Math.PI*2*Radius;
    }
}
