

public class Circle {

    private double Radius;          //радиус окружности = R
    private double Ference;         //длина окружности С = 2 * пи * R
    private double Area;            //Площадь окружности S = pi * R * R

    public double setRadius (double a){
            double b = Math.abs(a);
            Ference = 2 * Math.PI * b;
            Area = Math.PI * b * b;
            return Radius = b;

    }
    public double getRadius(){
        return Radius;
    }

    public double setFerence (double a){
        double b = Math.abs(a);
        Radius = 2 * Math.PI / b;
        Area = Math.PI * getRadius() * getRadius();
        return Ference = b;
    }
    public double getFerence (){
        return Ference;
    }

    public double setArea (double a){
        double b = Math.abs(a);
        Radius = Math.sqrt(b / Math.PI);
        Ference = 2 * getRadius() * getRadius();
        return Area = b;
    }
    public double getArea(){
        return Area;
    }



}
