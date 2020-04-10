class Circle {
    private double radius;
    private double ference;
    private double area;

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
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * radius * radius;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = ference / (2 * Math.PI);
        this.area = Math.PI * this.radius * this.radius;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(area / Math.PI);
        this.ference = 2 * Math.PI * this.radius;
    }


}

public class task6 {
    public static double earthTask(double earthRadius, double ropeLength) {
        Circle circle = new Circle();
        circle.setRadius(earthRadius);
        double area1 = circle.getArea();
        circle.setFerence(circle.getFerence() + ropeLength);
        double area2 = circle.getArea();
        return area2 - area1;
    }

    public static double poolTask(double priceTrack, double priceFence, double poolRadius, double trackWidth) {
        Circle circle2 = new Circle();
        circle2.setRadius(poolRadius);
        double areaPool = circle2.getArea();
        circle2.setRadius(poolRadius + trackWidth);
        double areaTotal = circle2.getArea();
        return (areaTotal - areaPool) * priceTrack + circle2.getFerence() * priceFence;
    }

    public static void main(String[] args) {
        System.out.println("Площадь зазора равна " + earthTask(6378.1, 0.001) + " кв.км.");
        System.out.printf("Общая стоимость: %,.2f у.е.", poolTask(1000, 2000, 3, 1));
    }
}
