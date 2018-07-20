class Circle {
    private double Radius;
    private double Ference;
    private double Area;
    Circle (double radius) {
        this.Radius = radius;
        this.Ference = 2.0 * 3.14 * radius;
        this.Area =  3.14 * radius * radius;
    }
    Circle () {
        this.Radius = 0;
        this.Ference = 0;
        this.Area =  0;
    }
    public void setRadius(double radius) {
        this.Radius = radius;
        this.Ference = 2.0 * 3.14 * radius;
        this.Area =  3.14 * radius * radius;
    }
    public void setFerence(double ference) {
        this.Radius = ference / (2.0 * 3.14);
        this.Ference = ference;
        this.Area =  3.14 * Radius * Radius;
    }
    public void setArea(double area) {
        this.Radius = Math.sqrt(area / 3.14);
        this.Ference = 2.0 * 3.14 * Radius;
        this.Area = area;
    }
    public double getRadius() {
        return this.Radius;
    }
    public double getArea() {
        return this.Area;
    }public double getFerence() {
        return this.Ference;
    }
    public static void earthAndRope(double radiusEarth, double delta) {
        Circle circle = new Circle(radiusEarth);
        double a = circle.getRadius();
        circle.setFerence(circle.getFerence()+ delta);
        double b = circle.getRadius();
        double dl = (b-a) * 100;
        double c = (double)Math.round(dl * 100d) / 100d;
        System.out.println("Величина зазора равна " + c + " см.");
    }
    public static void pool(double radiusPool, double shirDor) {
        Circle circle = new Circle(radiusPool);
        double a = circle.getArea();
        circle.setRadius(circle.getRadius() + shirDor);
        double b = circle.getArea();
        double pl = (b - a) * 1000;
        double c = (double)Math.round(pl * 100d) / 100d;
        System.out.println("Стоимость бетонной дорожки = " + c + "р.");
        System.out.println("Стоимость ограды = " + Math.round((circle.getFerence()*2000) * 100d) / 100d + "р." );
    }
}
public class Zadanie_6 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.earthAndRope(6378.1, 1.00);
        circle.pool(3.0,1.0);
    }
}

