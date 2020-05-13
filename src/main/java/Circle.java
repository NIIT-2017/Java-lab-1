public class Circle {
    private double Radius;
    private double Ference;
    private double Area;

    public double getRadius() {
        return Radius;
    }

    public double getFerence() {
        return Ference;
    }

    public double getArea() {
        return Area;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
        this.Ference = 2*Math.PI*Radius;
        this.Area = Math.PI*Math.pow(Radius,2.0);
    }

    public void setFerence(double Ference) {
        this.Ference = Ference;
        this.Radius = Ference/(2*Math.PI);
        this.Area = Ference*Radius/2;
    }

    public void setArea(double Area) {
        this.Area = Area;
        this.Radius = Math.sqrt(Area/Math.PI);
        this.Ference = 2*Math.PI*Radius;
    }
}
