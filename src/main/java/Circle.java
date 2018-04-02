public class Circle {
    private double Radius;  //радиус
    private double Ference; //длина окружности
    private double Area;    //площадь круга

    public void setRadius(double radius) {
        this.Radius = radius;
        this.Ference = 2 * Math.PI * this.Radius;
        this.Area = Math.PI * Math.pow(this.Radius, 2);
    }

    public void setFerence(double ference) {
        this.Ference = ference;
        this.Radius = this.Ference / Math.PI / 2;
        this.Area = Math.PI * Math.pow(this.Radius, 2);
    }

    public void setArea(double area) {
        this.Area = area;
        this.Radius = Math.sqrt(this.Area/Math.PI);
        this.Ference = 2 * Math.PI * this.Radius;
    }
    public double getRadius(){
        return this.Radius;
    }
    public double getFerence(){
        return this.Ference;
    }
    public double getArea(){
        return this.Area;
    }
}

