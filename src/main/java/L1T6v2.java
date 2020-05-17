class Circle
{
    double radius;
    double ference;
    double area;
    void setRadius(double radius)
    {
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * radius * radius;
    }
    public double getRadius()
    {
        return radius;
    }
    void setFerence(double ference)
    {
        this.radius = ference / 2 / Math.PI;
        this.ference = ference;
        this.area = Math.PI * this.radius * this.radius;
    }
    public double getFerence()
    {
        return ference;
    }
    void setArea(double area)
    {
        this.radius = Math.pow((area / Math.PI), 0.5);
        this.ference = this.radius * 2 * Math.PI;
        this.area = area;
    }
    public double getArea()
    {
        return area;
    }
}
public class L1T6v2
{
    public static void main(String []args)
    {
        Circle Earth=new Circle();
        Earth.setRadius(6378.1);
        double radius1=Earth.radius;
        Earth.setFerence(Earth.ference+0.001);
        System.out.println("delta radius="+(Earth.radius-radius1)*1000+"");
        Circle Pool=new Circle();
        Pool.setRadius(3);
        double s1=Pool.area;
        Pool.setRadius(4);
        double cash1=(Pool.area-s1)*1000;
        double cash2=Pool.ference*2000;
        System.out.println("rub for road="+cash1+"\nrub for fence="+cash2+"");
    }
} 