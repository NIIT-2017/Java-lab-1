public class Circle {
    private double radius;
    private  double ference;
    private double area;

    public Circle(double radius){
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * Math.pow(radius,2);
    }

    public double getFerence() {
        return ference;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = ference / 2 / Math.PI;
        this.area = Math.PI * Math.pow(radius,2);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(area / Math.PI);
        this.ference = 2 * Math.PI * radius;
    }

}

class Task6 {
    public static void main(String[] args) {
        Circle  rope = new Circle((double)6378.1);
        double dist = rope.getRadius();
        rope.setFerence(rope.getFerence() + 0.001);
        double diff = rope.getRadius() - dist;
        System.out.println(diff);
        Circle road = new Circle(4);
        double roadPrice = road.getArea() * 1000;
        double fencePrice = road.getFerence() * 2000;
        double totalPrice =roadPrice + fencePrice;
        System.out.println((float)roadPrice);
        System.out.println((float)fencePrice);
        System.out.println((float)totalPrice);
    }
}
