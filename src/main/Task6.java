public class Task6 {

    public static void main(String[] args) {
        Circle Rope = new Circle(10);
        Rope.setRadius(6378.1);
        double earthFerence = Rope.getFerence()+0.001;
        double earthRadius = earthFerence/2/Math.PI;
        double diference = (earthRadius-Rope.getRadius())*1000;

        System.out.println("1.Diference = " + diference + " m.");

        Circle Pool = new Circle(3);
        Circle PoolandPath = new Circle(4);
        double pricePath = (PoolandPath.getArea()-Pool.getArea())*1000;
        double priceFence = (PoolandPath.getFerence()-Pool.getFerence())*2000;

        System.out.println("2.Price of path = " + pricePath + ", price of fence = " + priceFence);
    }
}

class Circle {

    private double  Radius;
    private double Ference;
    private double Area;

    public Circle (double radius) {
       this.Radius = radius;
       this.Ference = 2*Math.PI*radius;
       this.Area = Math.PI*radius*radius;
   }

    public double getRadius() {
        return Radius;
    }

    public double getFerence() {
        return Ference;
    }

    public double getArea() {
        return Area;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
        this.Ference = 2*Math.PI*radius;
        this.Area = Math.PI*Math.pow(radius,2);
    }

    public void setFerence(double ference) {
        this.Ference = ference;
        this.Radius = ference/2/Math.PI;
        this.Area = Math.PI*Math.pow((ference/2/Math.PI),2);
    }

    public void setArea(double area) {
        this.Area = area;
        this.Radius = Math.sqrt(area/Math.PI);
        this.Ference = 2*Math.PI*(Math.sqrt(area/Math.PI));
    }
}
