package circle_demo.circle;

public class Circle {

    private double radius;
    private double circumference;
    private double area;

    public double countCircumference(double r) {
        double f = 2 * Math.PI * r;
        return f;
    }

    public double countArea(double r) {
        double a = Math.PI * r * r;
        return a;
    }

    public double countRadiusFromArea(double a) {
        double r = 0;
        try {
            if(a<0) throw new NumberFormatException();
            r = Math.sqrt(a / Math.PI);
        }catch (NumberFormatException nfe){
            System.err.println("Подкоренное выражение не может быть меньше нуля!");
        }
        return r;
    }

    public double countRadiusFromCircumference(double f) {
        double r = f / (2 * Math.PI);
        return r;
    }

    public void setRadius(double r) {
        this.radius = r;
        double f = countCircumference(r);
        this.circumference = f;
        double a = countArea(r);
        this.area = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setCircumference(double f) {
        this.circumference = f;
        double r = countRadiusFromCircumference(f);
        this.radius = r;
        double a = countArea(r);
        this.area = a;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setArea(double a) {
        this.area = a;
        double r = countRadiusFromArea(a);
        this.radius = r;
        double f = countCircumference(r);
        this.circumference = f;
    }

    public double getArea() {
        return area;
    }
}
