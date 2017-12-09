import java.math.*;
public class task6 {

    public static void main(String[] argc) {
        System.out.print("Erath and Rope : ");
        EarthAndRope();

        System.out.print("Pool : ");
        Pool();
    }

    public static void EarthAndRope() {

        Circle earth = new Circle();
        double rad1 = 6378.1;
        earth.add_rad(rad1);
        double ref1 = earth.getRef();
        ref1 += 1;
        earth.add_ref(ref1);
        double newRad = earth.getRad();
        double difference = newRad - rad1;
        System.out.println(difference);
    }

    public static void Pool() {
        Circle pool1 = new Circle();
        double sum=0;
        double pool_rad = 3;
        pool1.add_rad(pool_rad);
        double ar_small = pool1.getArea();
        double path_width = 1;
        pool1.add_rad(pool_rad+path_width);
        double ar_big = pool1.getArea();
        sum+= (ar_big-ar_small)*1000; // cost of path
        double ref_big= pool1.getRef();
        sum+= ref_big * 2000; // cost of reference
        System.out.println( sum);
    }

}

     class Circle{
    private double radius;
    private double reference;
    private double area;

    Circle(){
        radius=0;
        reference =0;
        area=0;
    }

    public void add_rad(double r){
        radius = r;
        reference = 2*Math.PI*radius;
        area = Math.PI*radius*radius;
    }

    public void add_ref(double r){
        reference = r;
        radius = reference/(2*Math.PI);
        area = Math.PI*radius*radius;
    }
    public void add_area(double r){
        area = r;
        radius = Math.sqrt(area/Math.PI);
        reference = 2*Math.PI*radius;
    }
    public double getRef(){return reference;}

    public double getRad(){return radius;}

    public double getArea(){return area;}
}