public class Circle
{
    final double pi=3.14159;
    public enum ParamName {
        RADIUS, FERENCE, AREA
    }
    private double radius, ference, area;
    Circle() {
        this(0,0,0);
    }
    Circle(double radius, double ference, double area) {
        this.radius=radius; this.ference=ference; this.area=area;
    }
    Circle(ParamName pname, double val) {
        setParam(pname, val);
    }
    public boolean setParam(ParamName pname, double val) {
        boolean result = true;
        switch (pname) {
            case RADIUS: {
                result = setRadius(val);
                return result;
            }
            case FERENCE: {
                result = setFerence(val);
                return result;
            }
            case AREA: {
                result = setArea(val);
                return result;
            }
            default: result = false;
        }
        return result;
    }
    private boolean setRadius(double radius) {
        if (radius <= 0) return false;
        this.radius = radius;
        ference= 2 * pi * radius;
        area= pi * radius * radius;
        return true;
    }
    private boolean setFerence(double ference) {
        if (ference <= 0) return false;
        this.ference = ference;
        radius = ference / (2 * pi);
        area = pi * radius * radius;
        return true;
    }
    private boolean setArea(double area) {
        if (area <= 0) return false;
        this.area = area;
        radius= Math.sqrt(area / pi);
        ference = 2 * pi * radius;
        return true;
    }
    public double getParam(ParamName pname) {
        switch (pname) {
            case RADIUS: return getRadius();
            case FERENCE: return getFerence();
            case AREA: return getArea();
        }
        return 0;
    }
    private double getRadius() {
        return radius;
    }
    private double getFerence() {
        return ference;
    }
    private double getArea() {
        return area;
    }
}