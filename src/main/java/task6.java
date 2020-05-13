
class CircleDemo{
    private double Radius;
    private double Ference; //длина окружности
    private double Area;    //площадь круга

    public double getRadius(){
        return Radius;
    }
    public double getFerence(){
        return Ference;
    }
    public double getArea(){ return Area; }

    public void setRadius(double radius){
        this.Radius = radius;
        this.Ference = 2 * Math.PI * radius;
        this.Area = Math.PI * Math.pow(radius, 2);
    }
    public void setFerence(double ference){
        this.Ference = ference;
        this.Radius = ference/(2 * Math.PI);
        this.Area = Math.PI * Math.pow(this.Radius, 2);
    }
    public void setArea(double area){
        this.Area = area;
        this.Radius = Math.sqrt(area/Math.PI);
        this.Ference = 2 * Math.PI * this.Radius;
    }
}

public class task6 {

    public static void main(String[] args){
        CircleDemo earth = new CircleDemo();
        earth.setRadius(6378.1);
        double temp = earth.getFerence();
        earth.setFerence(temp+0.001);
        System.out.println("Задача \"Земля и веревка\". Величина зазора = " + (double)(earth.getRadius() - 6378.1));

        CircleDemo pool = new CircleDemo();
        pool.setRadius(3);
        double s_small = pool.getArea();
        pool.setRadius(4);
        double s_big = pool.getArea();
        System.out.println("Задача \"Бассейн\". Стоимость работ = "+(double)((s_big-s_small)*1000+(pool.getFerence())*2000));
    }
}
