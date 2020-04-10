package HomeworkLab1;

public class Circle {
    private double radius,ference,area;
    private void computeArea()
    {
        area=Math.PI*Math.pow(radius,2);
    }
    private  void  computeFerence()
    {
        ference=2*Math.PI*radius;
    }
    public double getArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public double getFerence() {
        return ference;
    }

    public void setArea(double area) {
        this.area = area;
        radius=Math.sqrt(area/Math.PI);
        computeFerence();
    }

    public void setRadius(double radius) {
        this.radius = radius;
        computeArea();
        computeFerence();
    }

    public void setFerence(double ference) {
        this.ference = ference;
        radius=ference/(2*Math.PI);
        computeArea();
    }
}
