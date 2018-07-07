class Circle {

    private double radius;
    private double ference;
    private double area;

    public void setRadius(double radius) throws UnsupportedOperationException {
        if(radius == 0) throw new UnsupportedOperationException("Invalid value!");
        this.radius = radius;
        this.ference = 2 * (Math.PI * radius);
        this.area = Math.PI * Math.pow(radius, 2);
    }

    public void setFerence(double ference) throws UnsupportedOperationException {
        if(ference == 0) throw new UnsupportedOperationException("Invalid value!");
        this.ference = ference;
        this.radius = ference / (2 * Math.PI);
        this.area = Math.PI * Math.pow(radius, 2);
    }

    public void setArea(double area) throws UnsupportedOperationException {
        if(area == 0) throw new UnsupportedOperationException("Invalid value!");
        this.area = area;
        this.radius = Math.sqrt(area/Math.PI);
        this.ference = 2 * (Math.PI * radius);
    }


    public double getRadius() {return radius;}
    public double getArea() {return area;}
    public double getFerence() {return ference;}

    @Override
    public String toString() {
        return String.format("Area: %.2f\nFerence: %.2f\nRadius: %.2f", area, ference, radius);
    }

}

public class CircleDemo {

    public static double EarthAndRope() {
       // Initialize two objects of Earth
        Circle currentEarth = new Circle();
        Circle earthWithWithNewParameters = new Circle();

        double difference;

        // Set radius in meters
        currentEarth.setRadius(6378.1 * 1000);

        //  Set new parameters of new Earth with new rope
        earthWithWithNewParameters.setFerence(currentEarth.getFerence() + 1.0);

        difference = earthWithWithNewParameters.getRadius() - currentEarth.getRadius();

        return difference;
    }

    public static String pool() {
        Circle pool = new Circle();
        pool.setRadius(3);

        Circle road = new Circle();
        road.setRadius(pool.getRadius() + 1);

        double fencePrice = road.getFerence() * 2000;
        double roadPrice = (road.getArea() - pool.getArea()) * 1000;

        return String.format("Amount price: %.0f rub", fencePrice + roadPrice);

    }

    public static void main(String[] args) {
        System.out.println(EarthAndRope());
        System.out.println(pool());
    }
}
