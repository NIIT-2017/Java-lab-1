public class Task6 {
    public static void main(String[] args)
    {
        double earthRadius = 6378.1; //kilometres
        double insertion = 1; //metres
        System.out.format("The distance is: %1.2f metres \n", earthAndRope(earthRadius, insertion));
        double pathMetrePrice = 1000; //rubles per square metre
        double fenceMetrePrice = 2000; //rubles per linear meter
        double pathWide = 1; //metres
        double poolRadius = 3; //metres
        System.out.format("Total price of the materials is: %1.2f roubles\n", pool(pathMetrePrice, fenceMetrePrice, pathWide, poolRadius));
    }
    public static double earthAndRope(double earthRadius, double insertion){
        earthRadius *= 1000;//metres
        Circle Earth = new Circle();
        Earth.setRadius(earthRadius);
        Circle EarthAndRope = new Circle();
        EarthAndRope.setFerence(Earth.getFerence()+insertion);
        return (EarthAndRope.getArea() - Earth.getArea());
    }
    public static double pool(double pathMetrePrice, double fenceMetrePrice, double pathWide, double poolRadius){
        Circle pool = new Circle();
        pool.setRadius(poolRadius);
        Circle poolAndPath = new Circle();
        poolAndPath.setRadius(pool.getRadius()+1);
        double pathArea = poolAndPath.getArea() - pool.getArea();
        double pathPrice = pathMetrePrice*pathArea;
        System.out.format("price of the materials for the path is: %1.2f roubles\n", pathPrice);
        double fenceLength = poolAndPath.getFerence();
        double fencePrice = fenceMetrePrice*fenceLength;
        System.out.format("price of the materials for the fence is: %1.2f roubles\n", fencePrice);
        return pathPrice+fencePrice;
    }
}
class Circle{
    private double Radius;
    private double Ference;
    private double Area;
    public Circle(){
        Radius=0;
        Ference=0;
        Area=0;
    }
    public void setRadius(double radius) {
        Radius = radius;
        Ference = 2*Math.PI*Radius;
        Area = Math.PI*Radius*Radius;
    }
    public void setFerence(double ference) {
        Ference = ference;
        Radius = Ference/(2*Math.PI);
        Area = Math.PI*Radius*Radius;
    }
    public void setArea(double area) {
        Area = area;
        Radius = Math.sqrt(Area/(Math.PI));
        Ference = 2*Math.PI*Radius;
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
}
