public class task6 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        double ropeMin = 6378100;
        circle1.SetRadius(ropeMin);
        double ference = circle1.GetFerence();
        ference += 1;
        circle1.SetFerence(ference);
        double ropeMax = circle1.GetRadius();
        double gap = ropeMax - ropeMin;
        System.out.println("Task: 'Earth and rope':");
        System.out.println("The gap is " + gap + " meters");

        circle1 = new Circle();
        circle1.SetRadius(3);
        double areaPool = circle1.GetArea();
        circle1.SetRadius(4);
        double costRoad = 1000 * (circle1.GetArea() - areaPool);
        double costFence = 2000 * circle1.GetFerence();
        System.out.println("\nTask: 'Pool':");
        System.out.printf("The cost of materials for a concrete road is %.2f p.\n", costRoad);
        System.out.printf("The cost of fence materials around the pool is %.2f p.\n", costFence);

    }
}
class Circle{
    private double radius;
    private double ference;
    private double area;

    double GetRadius(){
        return radius;
    }
    double GetFerence(){
        return ference;
    }
    double GetArea(){
        return area;
    }

    void SetRadius(double radius){
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
        ference = 2 * Math.PI * radius;
    }
    void SetFerence(double ference){
        this.ference = ference;
        radius = ference /(2 * Math.PI);
        area = Math.pow(ference, 2)/(4 * Math.PI);
    }
    void SetArea(double area){
        this.area = area;
        radius = Math.sqrt(area / Math.PI);
        ference = 2 * Math.sqrt(Math.PI * area);
    }

}
