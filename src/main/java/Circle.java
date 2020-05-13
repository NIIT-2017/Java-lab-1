import static java.lang.Math.PI;

public class Circle {
    private double Radius;
    private double Ference;
    private double Area;

    public Circle() {
    }
    public double getRadius() {
        return Radius;
    }
    public double getFerence() {
        return Ference;
    }

    public double getArea() {
        return Area;
    }
    public void setRadius(double radius) {
        this.Radius = radius;
        this.Ference = PI*2*radius;
        this.Area = PI*Math.pow(radius, 2);
    }
    public void setFerence (double ference) {
        this.Ference = ference;
        this.Radius = ference/PI/2;
        this.Area = PI*Math.pow(this.Radius, 2);
    }
    public void setArea (double area) {
        this.Area = area;
        this.Radius = Math.sqrt(area/PI);
        this.Ference = this.Radius*PI*2;
    }
    public static void main (String[] args) {
        //The task solution "Earth and rope"
        Circle earthAndRope = new Circle();
        earthAndRope.setRadius(6378.1*1000);
        double radius = earthAndRope.getRadius();
        double newRopeFerence = earthAndRope.getFerence()+1000;
        earthAndRope.setFerence(newRopeFerence);
        double gap = earthAndRope.getRadius() - radius ;
        System.out.println("The gap is " + gap);

        //The task solution "Swimming pull"
        Circle swimmingPoolAndPath = new Circle();
        swimmingPoolAndPath.setRadius(3);
        double swimmingPullArea = swimmingPoolAndPath.getArea();
        swimmingPoolAndPath.setRadius(3+1);
        double concretePathArea = swimmingPoolAndPath.getArea() - swimmingPullArea;
        double costOf1sqmOfConcreteCoating = 1000;
        double costOf1mOfFence = 2000;
        double costOfAllMaterials = (concretePathArea*costOf1sqmOfConcreteCoating) + (swimmingPoolAndPath.getFerence()*costOf1mOfFence);
        System.out.println("Cost of all materials is " + costOfAllMaterials + " r.");
    }
}

