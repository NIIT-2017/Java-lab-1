import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        circle earth = new circle();
        earth.setRadius(6378.1);
        circle rope = new circle();
        rope.setFerence(earth.getFerence()+0.001);
        double gap = (rope.getRadius()-earth.getRadius())*100000;
        System.out.printf("Величина зазора между землей и веревкой составляет %.2f сантиметра\n", gap);
        circle pool = new circle();
        circle track = new circle();
        pool.setRadius(3);
        track.setRadius(pool.getRadius()+1);
        double cost = track.getFerence()*2000+(track.getArea()-pool.getArea())*1000;
        System.out.printf("Затраты на дорожку с оградой составляют %.2f рублей\n", cost);
    }
}

class circle {
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
    public void setRadius(double radius) {
        Radius = radius;
        Ference = 2*Math.PI*Radius;
        Area = Math.PI*Math.pow(Radius, 2);
    }
    public void setFerence(double ference) {
        Ference = ference;
        Radius = Ference/(2*Math.PI);
        Area = Math.PI*Math.pow(Radius, 2);
    }
    public void setArea(double area) {
        Area = area;
        Radius = Math.sqrt(Area/Math.PI);
        Ference = 2*Math.PI*Radius;
    }
}