//Задача 6. Проект CircleDemo
class Circle  {
    private double Radius, Ference, Area;
    public void setRad(double R){
        Radius=R;
        Ference=2*Math.PI*R;
        Area=Math.PI*Math.pow(R,2);
    }
    public void setFer(double F){
        Ference=F;
        Radius=F/(2*Math.PI);
        Area=Math.pow(F,2)/(4*Math.PI);
    }
    public void setAr(double A){
        Area=A;
        Radius=Math.sqrt(A/Math.PI);
        Ference=Math.sqrt(A*4*Math.PI);
    }
    public double getRad(){
        return Radius;
    }
    public double getFer(){
        return Ference;
    }
    public double getAr(){
        return Area;
    }
}
