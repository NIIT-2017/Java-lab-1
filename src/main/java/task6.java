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
        this.radius= this.ference / (2 * Math.PI);     // r = l/2П
        this.area = Math.PI * Math.pow(this.radius, 2); // S = П*r^2
    }

    public void setArea(double area, String format){
        if (area > 0 && format.equals("km"))
            this.area = area * 1000;
        else if (area > 0 && format.equals("m"))
            this.area = area;
        else
            System.out.println("unknown format area or area < 0");
        this.radius= Math.sqrt(this.area/Math.PI);   // r = (S/П)^0.5
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

public class task6 {
    public static void main (String[] args){
        //Земля и веревка
        Circle gap = new Circle();
        final double radius = 6378.1;   //(km)
        gap.setRadius(radius,"km");
        double r1 = gap.getRadius();    //(m)
        gap.setFerence(gap.getFerence()+1,"m");
        double r2 = gap.getRadius();
        System.out.println("Задача земля веревка: дельта = " + (r2 - r1) + " метр\n");
        //Бассейн
        Circle B = new Circle();
        final double cost_m1 = 1000; //(руб.) - Стоимость бетонного материала (for m^2)
        final double cost_m2 = 2000; //(руб.) - стоимость 1 метра забора
        B.setRadius(3,"m");
        double s1 = B.getArea();
        B.setRadius(B.getRadius()+1, "m");
        double s2 = B.getArea();
        System.out.printf("Задача бассейн: Стоимость бетонного покрытия %.2f руб \n",(s2-s1)*cost_m1);
        System.out.printf("Задача бассейн: Стоимость материала для ограждения %.2f руб \n", ((B.getFerence())*cost_m2));
    }
}
