public class CircleDemo {
    public static void main(String[] args) {
        double result;
        if ((result = Tasks.EarthAndRope(1)) != -1)
            System.out.format("Gap = %.2f metre(s)%n", result);
        if ((result = Tasks.PoolBeautification(3)) != -1)
            System.out.format("Full price = %.2f RUB%n", result);
    }
}

class Circle{
    private double radius;
    private  double ference;
    private double area;

    public Circle(){
        setRadius(1);
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return area;
    }
    public double getFerence() {
        return ference;
    }

    public void setRadius(double radius) {
        if (radius > 0){
            this.radius = radius;
            ference = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);
        }
        else
            System.out.println("Value of radius must be above zero!");
    }
    public void setArea(double area) {
        if (area > 0){
            this.area = area;
            radius = Math.sqrt(area / Math.PI);
            ference = 2 * Math.PI * radius;
        }
        else
            System.out.println("Value of area must be above zero!");
    }
    public void setFerence(double ference) {
        if (ference > 0){
            this.ference = ference;
            radius = ference / (2 * Math.PI);
            area = Math.PI * Math.pow(radius, 2);
        }
        else
            System.out.println("Value of radius must be above zero!");
    }
}

class Tasks{

    private static final int earthRadius = 6378100;
    private static Circle circle = new Circle();
    private static double poolRadius = 3;
    private static double roadWidth = 1;
    private static int roadPrice = 1000;
    private static int fencePrice = 2000;

    public static double EarthAndRope(double length){
        if (length <= 0){
            System.out.println("Invalid additional rope length!");
            return -1;
        }
        circle.setRadius(earthRadius);
        return (circle.getFerence() + length) / (Math.PI * 2) - circle.getFerence() / (Math.PI * 2);
    }

    public static double PoolBeautification(double rad){
        if (rad <= 0){
            System.out.println("Invalid pool radius!");
            return -1;
        }
        poolRadius = rad;
        double area1, area2, price1, price2;
        circle.setRadius(poolRadius);
        area1 = circle.getArea();
        circle.setRadius(poolRadius + roadWidth);
        area2 = circle.getArea();
        price1 = (area2 - area1) * roadPrice;
        System.out.format("Price of the road = %.2f RUB%n", price1);
        price2 = circle.getFerence() * fencePrice;
        System.out.format("Price of the fence : %.2f RUB%n", price2);
        return price1 + price2;
    }
}
