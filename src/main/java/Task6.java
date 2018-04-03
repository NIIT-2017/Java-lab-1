public class Task6 {
    public static void main(String[] args){
        double earthRadius=6378.1;
        Circle earth=new Circle();
        earth.setRadius(earthRadius);
        earth.setFerence(earth.getFerence()+0.001);
        System.out.printf("Зазор = %.6f км\n",earth.getRadius()-earthRadius);

        double priceRoad=1000.0;
        double priceFence=2000.0;
        double poolRadius=3.0;
        double fenceWidth=1.0;
        Circle pool=new Circle();
        Circle road=new Circle();
        pool.setRadius(poolRadius);
        road.setRadius(poolRadius+fenceWidth);
        double priceRoadEnd=(road.getArea()-pool.getArea())*priceRoad;
        System.out.printf("Стоимость дорожки=%.2f руб.\n",priceRoadEnd);
        System.out.printf("Стоимость ограды с дорожкой=%.2f руб.\n",road.getFerence()*priceFence+priceRoadEnd);
    }
}

class Circle{
    private double Radius;
    private double Ference;
    private double Area;

    public void setRadius(double rad){
        Radius=rad;
        Ference=Math.PI*2*rad;
        Area=Math.PI*Math.pow(rad,2.0);
    }

    public void setFerence(double fer){
        Ference=fer;
        Radius=Ference/Math.PI/2;
        Area=Math.PI*Math.pow(Radius,2.0);
    }

    public void setArea(double area){
        Area=area;
        Radius=Math.sqrt(Area/Math.PI);
        Ference=Math.PI*2*Radius;
    }

    public double getRadius(){
        return Radius;
    }

    public double getFerence(){
        return Ference;
    }
    public double getArea(){
        return Area;
    }
}
