import java.text.DecimalFormat;

class Circle {
    private double radius, ference, area;
    private double pi = Math.PI;

    double getFerenceFromRadius(double radius) {return ference = 2 * pi * radius;}
    double getAreaFromRadius(double radius) {return area = pi * radius * radius;}
    double getRadiusFromFerence(double ference) {return radius = ference / (2 * pi);}
    double getAreaFromFerence(double ference) {return area = ference * ference / (4 * pi);}
    double getRadiusFromArea(double area) {return radius = Math.sqrt(area / pi);}
    double getFerenceFromArea(double area) {return ference = 2 * pi * Math.sqrt(area / pi);}
}

class KnotAroundEarth {
    private double delta_diameter;
    Circle circle = new Circle();

    double getDelta_diameter(double radius_in, double delta_ference) {
        return (circle.getRadiusFromFerence(
                circle.getFerenceFromRadius(radius_in) + delta_ference)
                - radius_in) * 2;
    }
}

class SwimmingPool {
    private double walkway_cost, fence_cost;
    Circle pool = new Circle();

    double getWalkway_cost(double swimmingpool_radius, double walkway_width, double walkway_price) {
        return (pool.getAreaFromRadius(swimmingpool_radius + walkway_width)
                - pool.getAreaFromRadius(swimmingpool_radius)) * walkway_price;
    }

    double getFence_cost(double swimmingpool_radius, double walkway_width, double fence_price) {
        return (pool.getFerenceFromRadius(swimmingpool_radius + walkway_width) * fence_price);
    }
}

public class Lab1Task6 {
    public static void main(String[] args) {
//task about the Knot around the Earth//
        DecimalFormat df1 = new DecimalFormat("#0.000");
        double delta_diameter;
        double earth_radius = 6378.1; //kilometers
        double add_knot = 1; //meters
        KnotAroundEarth knot = new KnotAroundEarth();
        delta_diameter = knot.getDelta_diameter(earth_radius, add_knot / 1000) * 1000; // meters
        System.out.println("Delta diameter = " + df1.format(delta_diameter) + " meters");

//task about the Swimming Pool//
        DecimalFormat df2 = new DecimalFormat("#0.00");
        double swimmingpool_radius = 3; //meters
        double walkway_width = 1; //meters
        double walkway_price = 1000; //rubles per meter^2
        double fence_price = 2000; //rubles per meter^2
        double walkway_cost, fence_cost;
        SwimmingPool pool = new SwimmingPool();
        walkway_cost = pool.getWalkway_cost(swimmingpool_radius, walkway_width, walkway_price); //rubles
        fence_cost = pool.getFence_cost(swimmingpool_radius, walkway_width, fence_price); //rubles
        System.out.println("The cost of the walkway = " + df2.format(walkway_cost) + " rubles");
        System.out.println("The cost of the fence = " + df2.format(fence_cost) + " rubles");
    }
}