
class Circle {
    private double Radius;
    private double Ference;
    private double Area;
    final double P = 3.14;

    Circle (double r) {
        setRadius (r);
    }

    Circle () {
        setRadius(1);
    }

    private double calcFerence () {
        return 2*P*Radius;
    }

    private double calcArea () {
        return P*Radius*Radius;
    }

    public void setRadius (double r) {
        this.Radius = r;
        this.Ference = calcFerence ();
        this.Area = calcArea();
    }

    public double getRadius () {
        return Radius;
    }

    public void setFerence (double f) {
        Ference = f;
        Radius = Ference/(2*P);
        Area = calcArea();
    }

    public double getFerence () {
        return Ference;
    }

    public void setArea (double a) {
        this.Area = a;
        this.Radius = Math.sqrt (Area/P);
        this.Ference = calcFerence();
    }

    public double getArea () {
        return Area;
    }

    public void printAll () {
        System.out.println ("Radius = " + getRadius() + ",");
        System.out.println ("Ference = " + getFerence() + ",");
        System.out.println ("Area = " + getArea() + ",");
    }

}

public class CircleDemo {

    public static void main(String[] args) {
        //"Earth and Cable
        Circle Earth = new Circle (6_378.1);
        Circle Cable = new Circle ();

        Cable.setFerence(Earth.getFerence()+0.001);


        System.out.println ("Distance between Earth and Cable is " + Math.abs(Earth.getRadius() - Cable.getRadius()));
        System.out.println ();

        //Pool
        Circle Pool = new Circle (3);
        Circle Fence = new Circle (Pool.getRadius() + 1);
        int sqM = 1000;
        int runM = 2000;


        System.out.println ("Track costs " + Math.abs((int) Math.ceil (Fence.getArea() - Pool.getArea())) * sqM);
        System.out.println ("Fence costs " + ((int) Math.ceil (Fence.getFerence() * runM)));


    }
}
