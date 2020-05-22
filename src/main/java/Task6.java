import static java.lang.Math.PI;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Task6 {
    public static void main(String[] args){
        // the earth and the rope
        Circle eAr = new Circle();
        eAr.setRadius(6378100);
        Double eArArea = eAr.getArea();
        //1.2780049057763622E14
        Double eArFerence = eAr.getFerence();
        //4.007478420772212E7
        double ferenceOfEarth = eAr.getFerence();
        eAr.setFerence(ferenceOfEarth+1);
        System.out.println("Величина зазора: " + (double)(eAr.getRadius() - 6378100) + " метра.");
        // cost of swimming pool repearing
        Circle swimPool = new Circle();

        swimPool.setRadius(3);
        double internal = swimPool.getArea();
        swimPool.setRadius(4);
        double external = swimPool.getArea();
        double surface = external - internal;
        double cost = surface*1000+(swimPool.getFerence())*2000;
        System.out.println("Стоимость работ: " + (double)cost + " рублей.");
    }
}
class Circle{
    private double Radius;
    private double Ference;
    private double Area;

    public double getRadius(){
        return Radius;
    }
    public double getFerence(){
        return Ference;
    }
    public double getArea(){
        return Area;
    }
    public void setRadius(double radius){
        this.Radius = radius;
        this.Ference = 2 * PI * radius;
        this.Area = PI * pow(radius,2);
    }
    public void setFerence(double ference){
        this.Ference = ference;
        this.Radius = ference/(2 *PI);
        this.Area = PI * pow(this.Radius, 2);
    }
    public void setArea(double area){
        this.Area = area;
        this.Radius = sqrt(area/PI);
        this.Ference = 2 * PI * this.Radius;
    }
}
