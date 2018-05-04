public class CircleDemo{
    public static void main (String[] args){
        Circle Earth=new Circle();
        Earth.setRadius(6378.1);
        Circle rope=new Circle();
        rope.setFerence(Earth.getFerence()+0.001);
        System.out.println("Зазор между веревкой и Землей составляет "+ (rope.getRadius()-Earth.getRadius()) + " метров");

        Circle pool = new Circle();
        pool.setRadius(3);
        Circle road = new Circle();
        road.setRadius(pool.getRadius()+1);

        double fencePrice = 2000*road.getFerence();
        double roadPrice = 1000*(road.getArea()-pool.getArea());
        double fullPrice = fencePrice+roadPrice;

        System.out.println("Цена ограды и дорожки у бассейна радиусом 3 метра равна "+fullPrice);


    }
}

class Circle{
    private double Radius;
    private double Ference;
    private double Area;
    double Pi=3.14;

    void setRadius(double r){
        if (r<=0){
            System.out.println("Некорректный ввод");
        }
        Radius=r;
        Ference=2*Pi*r;
        Area=Pi*r*r;
    }

    void setFerence(double f){
        if (f<=0){
            System.out.println("Некорректный ввод");
        }
        Ference=f;
        Radius=f/(2*Pi);
        Area=(f*f)/(4*Pi);
    }

    void setArea(double a){
        if (a<=0){
            System.out.println("Некорректный ввод");
        }
        Area=a;
        Radius=Math.sqrt(a/Pi);
        Ference=2*Pi*Radius;
    }

    double getRadius(){
        return Radius;
    }

    double getFerence(){
        return Ference;
    }

    public double getArea() {
        return Area;
    }
}