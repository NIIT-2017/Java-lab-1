import javax.swing.*;

class Circle {
    private double radius;           //радиус
    private double ference;          //длинна окружности
    private double area;            //площадь круга
    private String format;

    public void setRadius(double radius, String format){
        if(radius > 0 && format.equals("km"))
            this.radius = radius * 1000;
        else if (radius > 0 && format.equals("m"))
            this.radius = radius;
        else
            System.out.println("unknown format radius or radius < 0");
        this.ference = 2 * Math.PI * this.radius;        // l = 2Пr
        this.area = Math.PI * Math.pow(this.radius,2);   // S = П*(r^2)
    }

    public void setFerence(double ference, String format){
        if(ference > 0 && format.equals("km"))
            this.ference = ference * 1000;
        else if (radius > 0 && format.equals("m"))
            this.ference = ference;
        else
            System.out.println("unknown format ference or ference < 0");
        this.radius = this.ference / (2 * Math.PI);     // r = l/2П
        this.area = Math.PI * Math.pow(this.radius, 2); // S = П*r^2
    }

    public void setArea(double area, String format){
        if (area > 0 && format.equals("km"))
            this.area = area * 1000;
        else if (area > 0 && format.equals("m"))
            this.area = area;
        else
            System.out.println("unknown format area or area < 0");
        this.radius = Math.sqrt(this.area/Math.PI);   // r = (S/П)^0.5
        this.ference = 2 * Math.PI * this.radius;    //  l = 2Пr
    }

    public double getRadius(){
        return radius;
    }
    public double getFerence(){
        return ference;
    }
    public double getArea() {
        return area;
    }
}

public class Task6 {
    public static void main (String[] args){
        //task "Earth and rope"
        Circle figure = new Circle();
        final double earth_rad = 6378.1;   //(km)
        figure.setRadius(earth_rad,"km");
        double r1 = figure.getRadius();    //(m)
        figure.setFerence(figure.getFerence()+1,"m");
        double r2 = figure.getRadius();
        System.out.println("Task1: delta = " + (r2 - r1) + " meters\n");
        //task "pool"
        Circle pool = new Circle();
        final double cost_m1 = 1000; //(rub) - material cost for the track (for m^2)
        final double cost_m2 = 2000; //(rub) - the cost of 1 m of the fence
        pool.setRadius(3,"m");
        double s1 = pool.getArea();
        pool.setRadius(pool.getRadius()+1, "m");
        double s2 = pool.getArea();
        System.out.printf("Task2: Cost of materials for concrete track %.2f rub \n",(s2-s1)*cost_m1);
        System.out.printf("Task2: Сost of materials for the pool fence %.2f rub \n", ((pool.getFerence())*cost_m2));
    }
}