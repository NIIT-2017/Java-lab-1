public class Circle {
    private double Radius, Ference, Area;

    Circle() {
        this.Radius = 0.0;
        this.Ference = 0.0;
        this.Area = 0.0;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
        this.Ference = 2 * Math.PI * Radius;
        this.Area = Math.PI * Math.pow(Radius, 2);
    }

    public void setFerence(double Ference) {
        this.Ference = Ference;
        this.Radius = Ference / (2 * Math.PI);
        this.Area = Math.pow(Ference, 2) / (4 * Math.PI);
    }

    public void setArea(double Area) {
        this.Area = Area;
        this.Radius = Math.sqrt(Area / Math.PI);
        this.Ference = Math.sqrt(Area * 4 * Math.PI);
    }

    public double getRadius() {
        return this.Radius;
    }

    public double getFerence() {
        return this.Ference;
    }

    public double getArea() {
        return this.Area;
    }
}