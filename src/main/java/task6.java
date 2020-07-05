class Circle {
    private double Radius;
    private double Ference;
    private double Area;

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
        this.Ference = 2*Math.PI*radius;
        this.Area = Math.PI*Math.pow(radius,2);
    }

    public void setFerence(double ference) {
        this.Ference = ference;
        this.Radius = ference/2/Math.PI;
        this.Area = Math.PI*Math.pow((ference/2/Math.PI),2);
    }

    public void setArea(double area) {
        this.Area = area;
        this.Radius = Math.sqrt(area/Math.PI);
        this.Ference = 2*Math.PI*(Math.sqrt(area/Math.PI));
    }
}

class Task6 {
    public static void main(String[] args) {
            Circle Earth    = new Circle();
            Circle Rope     = new Circle();
            Circle SwimPool = new Circle();
            Circle Path     = new Circle();

            Earth.setRadius(6378.1);
            Rope.setFerence(Earth.getFerence()+0.001);
            double Diff = (Rope.getRadius()-Earth.getRadius())*1000;
            System.out.printf("Difference: %.2f m \n", Diff);

            SwimPool.setRadius(3);
            Path.setRadius(SwimPool.getRadius()+1);
            double cost = Path.getFerence()*2000+(Path.getArea()-SwimPool.getArea())*1000;
            System.out.printf("Main costs: %.2f rub", + cost);
        }
}