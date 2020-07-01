import java.math.*;

public class Circle {
    private double Radius;
    private double Ference;
    private double Area;

    public double getRadius() {
        return Radius;
    }

    public double getFerence() {
        return Ference;
    }

    public double getArea() {
        return Area;
    }
    public void setRadius (double newRadius) {
        Radius=newRadius;
        Ference=2*Math.PI*Radius;
        Area=Math.PI*Math.pow(Radius,2);
    }
    public void setFerence (double newFerence) {
        Ference=newFerence;
        Radius=Ference/(2*Math.PI);
        Area=Math.pow(Ference, 2)/(4*Math.PI);
    }
    public void setArea (double newArea) {
        Area=newArea;
        Radius=Math.sqrt((Area/Math.PI));
        Ference=Math.sqrt((Area*2*Math.PI));
    }
}
class Circle_Demo {
    public static void main (String[] args) {
        Circle Earth = new Circle();
        Earth.setRadius(6378.1);
        Circle Hole = new Circle();
        Hole.setFerence(Earth.getFerence()+0.001);
        double result = (Hole.getRadius()-Earth.getRadius())*100000;
        System.out.println("Exact Difference is "+ result);
        Circle Pool = new Circle();
        Pool.setRadius(3);
        Circle PoolRoad = new Circle();
        PoolRoad.setRadius(Pool.getRadius()+1);
        double Cost = ((PoolRoad.getFerence()*2000)+((PoolRoad.getArea()-Pool.getArea())*1000));
        System.out.printf("Cost pool road and fence: %1.2f\n",Cost);
    }
}