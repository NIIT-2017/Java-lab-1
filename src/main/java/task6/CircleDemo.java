package task6;

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
    public void setRadius(double newRadius) {
        radius = newRadius;
        ference = 2 * StrictMath.PI * radius;
        area = StrictMath.PI * StrictMath.pow(radius , 2);
    }
    public void setFerence(double newFerence) {
        ference = newFerence;
        area = StrictMath.PI * StrictMath.pow(radius , 2);
        radius = ference / (2 * StrictMath.PI);
    }
    public void setArea(double newArea) {
        area = newArea;
        radius = ference / (2 * StrictMath.PI);
        ference = 2 * StrictMath.PI * radius;
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Circle land = new Circle();
        land.setRadius(6378.1);
        Circle cable = new Circle();
        cable.setFerence(land.getFerence() + 0.001);
        double diffefence = (cable.getRadius() - land.getRadius()) * 100000;
        System.out.printf("Difference is %1.2f km\n",diffefence);

        Circle pool = new Circle();
        Circle road = new Circle();
        pool.setRadius(3);
        road.setRadius(pool.getRadius() + 1);
        double cost = (road.getFerence() * 2000) + (road.getArea() - pool.getArea() * 1000);
        System.out.printf("Cost is %1.2f RUB\n",cost);
    }
}
