import com.sun.xml.internal.ws.config.metro.dev.FeatureReader;

class Circle {
   private double Radius;
   private double Ference;
   private double Area;

    public Circle(double Radius,double Ference, double Area){
        this.Area = Area;
        this.Ference = Ference;
        this.Radius = Radius;
    }

    Circle(double Radius) {

       this(Radius,0,0);

    }


    public double getRadius() {
        if (Ference > 0) Radius = Ference / (2 * Math.PI);
        else if (Area > 0) Radius = Math.sqrt(Area / Math.PI);
        return Radius;
    }
    public double getFerence() {
        if (Radius > 0)  Ference = 2 * Math.PI * Radius;
        else if (Area > 0) Ference = Math.sqrt(Area * 4 * Math.PI);
        return Ference;
    }
    public double getArea() {
        if (Radius > 0)  Area = Math.PI * Radius * Radius;
        else if (Ference > 0) Area = (Ference * Ference) / (4 * Math.PI);
        return Area;
    }
    public void setEarth(double f) {
        Ference = f;

    }
    public void Bass(double r,double f, double a) {
        Radius = r;
        Ference = f;
        Area = a;
    }
}

public class Numeric {

    public static void main(String[] args)
    {

        double Radius = Double.parseDouble(args[0]);
        double Ference= Double.parseDouble(args[1]);
        double Area = Double.parseDouble(args[2]);
        Circle circle = new Circle(Radius,Ference,Area);
        double radEarth = 6378.1;
        int PriceBetonMeter = 1000;
        int PriceOgradaMeter = 2000;
        double RadBass = 3;
        double WidthDor = 1;


        if (Radius>0) {
            double res_Ference = circle.getFerence();
            double res_Area = circle.getArea();
            System.out.println("Radius: " + Radius + " Ference: " + res_Ference + " Area: " + res_Area);

        }
        else if (Ference>0){
            double res_Radius = circle.getRadius();
            double res_Area = circle.getArea();
            System.out.println("Radius: " + res_Radius + " Ference: " + Ference + " Area: " + res_Area);
        }
        else {
            double res_Radius = circle.getRadius();
            double res_Ference = circle.getFerence();
            System.out.println("Radius: " + res_Radius + " Ference: " + res_Ference + " Area: " + Area);
        }

        double newRadEarth = deltaEarth(radEarth);
        double delta = newRadEarth - radEarth;
        System.out.println("delta: " + delta + " метров");

        double PriceBetonDor = priceBetonMeter(RadBass,WidthDor,PriceBetonMeter);
        double PriceOgrada = priceOgradaMeter(RadBass,WidthDor,PriceOgradaMeter);
        double FullPrice = PriceBetonDor + PriceOgrada;
        System.out.println("цена за дорожку:" + PriceBetonDor + " р. полная цена:" + FullPrice + " р.");

    }

    public static double deltaEarth(double radEarth){


        Circle circle = new Circle(radEarth);
        double newFerenceEarth = circle.getFerence()+1;
        circle.setEarth(newFerenceEarth);
        double newradEarth = circle.getRadius();
        return newradEarth;
    }

    public static double priceBetonMeter(double RadBass, double WidthDor, int PriceBetonMeter){
        Circle circle2 = new Circle(RadBass);
        double AreaBass = circle2.getArea();
        circle2.Bass((WidthDor+RadBass),0,0);
        double AreaBetonDor = circle2.getArea() - AreaBass;
        double PriceBetonDor = AreaBetonDor*PriceBetonMeter;
        return PriceBetonDor;
    }

    public static double priceOgradaMeter(double RadBass, double WidthDor, int PriceOgradaMeter){
        Circle circle3 = new Circle(RadBass+WidthDor);
        double FerenceOgrada = circle3.getFerence();
        double PriceOgrada = FerenceOgrada*PriceOgradaMeter;
        return PriceOgrada;
    }

}
