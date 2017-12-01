//Задание 6
class Circle {
    private double radius;
    private double ference;
    private double area;


    public void setRadius(double radius) {
        this.radius = radius;
        this.ference = 2*Math.PI*radius;
        this.area = Math.PI*Math.pow(radius,2);
    }
    public double getRadius(){
        return radius;
    }

    public void setFerence(double ference){
        this.ference = ference;
        this.radius = ference/(2*Math.PI);
        this.area = Math.PI*Math.pow(radius,2);
    }
    public double getFerence(){
        return ference;
    }

    public void setArea(double area){
        this.area = area;
        this.radius = Math.sqrt(area/Math.PI);
        this.ference = 2*Math.PI*radius;
    }
    public double getArea(){
        return area;
    }
}
public class CircleDemo {
    public static void main (String [] args){
        //Задание с веревкой
        Circle earth = new Circle();
        Circle rope = new Circle();
        earth.setRadius(6378100);
        rope.setFerence(earth.getFerence() + 1);
        System.out.println("Велечина зазора между веревкой и землей " + (rope.getRadius()- earth.getRadius()) + " м");
        //Задание с бассейном
        Circle pool = new Circle();
        Circle fence = new Circle();

        pool.setRadius(3);
        fence.setRadius(4);

        double fenceprice = fence.getFerence()*2000;
        double walkwayprice = (fence.getArea()- pool.getArea())*1000;
        System.out.println("Цена дорожки и забора " + (fenceprice+walkwayprice) + " руб");





    }

}
