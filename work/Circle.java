public class Circle {
    private double Radius;
    private double Area;
    private  double Ference;
    private double pi2 = 2*3.14159265;

    public void Circle (double Radius){
        this.Radius = Radius;
        this.Area = SolArea(Radius);
        this.Ference = SolFerence(Radius);
    }

    public void SetRadius (double Radius){
        this.Radius = Radius;
        Area = SolArea(Radius);
        Ference = SolFerence(Radius);
    }
    public void SetArea (double Area){
        this.Area = Area;
        Radius = SolRadiusArea(Area);
        Ference = SolFerence(Radius);
    }
    public void SetFerence(double Ference){
        this.Ference = Ference;
        Radius = SolRadiusFerence(Ference);
        Area = SolArea(Radius);
    }

    private double SolRadiusArea(double Area){
        Radius = Math.sqrt(Area/pi2);
        return Radius;
    }
    private double SolRadiusFerence(double Ference){
        Radius = Ference/pi2;
        return Radius;
    }
    private double SolFerence (double Radius){
        Ference = pi2*Radius;
        return Ference;
    }
    private double SolArea (double Radius){
        Area = pi2*Math.pow(Radius,2);
        return Area;
    }
    public double GetArea(){
        return Area;
    }
    public double GetFerence(){
        return Ference;
    }
    public double GetRadius(){
        return Radius;
    }

}
