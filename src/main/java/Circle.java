public class Circle {
    private double Radius, Ference, Area;
    Circle() {
        this.Radius = 0.;
        this.Ference = 0.;
        this.Area = 0.;
    }
    public void setRad(double R){
        this.Radius = R;
        this.Ference = 2 * Math.PI * R;
        this.Area = Math.PI * Math.pow(R,2);
    }
    public void setFer(double F){
        this.Ference = F;
        this.Radius = F / (2 * Math.PI);
        this.Area = Math.pow(F,2) / (4 * Math.PI);
    }
    public void setAr(double A){
        this.Area = A;
        this.Radius = Math.sqrt(A / Math.PI);
        this.Ference = Math.sqrt(A * 4 * Math.PI);
    }
    public double getRad() {return this.Radius;}
    public double getFer() {return this.Ference;}
    public double getAr() {return this.Area;}
}
