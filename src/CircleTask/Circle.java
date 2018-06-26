package CircleTask;

public class Circle {
    Circle circle;
    private double radius;
    private double ference;
    private double area;

    public void setRadius(double rad) {
        this.radius = rad;
        this.ference = 2*Math.PI*radius;
        this.area = Math.PI*Math.pow(radius, 2);
    }

    public void setFerence(double fer) {
        this.ference = fer;
        this.radius = fer/(2*Math.PI);
        this.area = Math.PI*Math.pow(radius, 2);
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(area/Math.PI);
        this.ference = 2*Math.PI*radius;
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

    public void earthAndRope() {
        circle = new Circle();
        circle.setRadius(6378.1*1000);
        double firstRadius = circle.getRadius();
        circle.setFerence(circle.getFerence()+1);
        double gap =  circle.getRadius()-firstRadius;
        System.out.println("Зазор межде веревкой и землей "+ gap + " м");
    }

    public void poolPrice() {
        circle = new Circle();
        circle.setRadius(3);
        double poolArea = circle.getArea();
        circle.setRadius(4);
        double roadArea = circle.getArea()-poolArea;
        double roadPrice = 1000*roadArea;
        double fencePrice = 2000*circle.getFerence();
        System.out.println("Стоимость дорожки "+ String.format("%.2f", roadPrice)+ " руб.");
        System.out.println("Стоимость дорожки "+ String.format("%.2f", fencePrice)+ " руб.");
    }

    public static void main(String[] args) {
        new  Circle().earthAndRope();
        new  Circle().poolPrice();
    }
}
