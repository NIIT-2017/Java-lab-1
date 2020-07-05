public class Circle {
    private double Radius;
    private double Ference;
    private double Area;

    public void setRadius(double radius){
        Radius = radius;
        Ference = 2*Math.PI*radius;
        Area = Math.PI*Math.pow(radius, 2.0);
    }

    public void setFerence(double ference){
        Ference = ference;
        Radius = ference /(2*Math.PI);
        Area = Math.PI*Math.pow(Radius, 2.0);
    }

    public void setArea(double area){
        Area = area;
        Radius = Math.sqrt(area/Math.PI);
        Ference = 2*Math.PI*Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double getFerence() {
        return Ference;
    }

    public double getArea() {
        return Area;
    }
}

