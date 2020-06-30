import static java.lang.Math.PI;

public class Task6 {
    public static void main(String[] args) {
        circle earth = new circle();
        earth.setRadius(6378.1); //km
        circle rad1 = new circle();
        rad1.setFerence(earth.getFerence()+0.001);
        double gap = (rad1.getRadius()-earth.getRadius())* 1000; //m
        System.out.printf("Зазор земли равен " + gap + " m\n");

        circle pool = new circle();
        circle wall = new circle();
        pool.setRadius(3);
        wall.setRadius(pool.getRadius()+1);
        double cost = wall.getFerence()*2000+(wall.getArea()-pool.getArea())*1000;
        System.out.printf("Стоимость работвокруг бассейна " + cost + " rub\n");
    }
}

class circle {
    private double radius;
    private double ference;
    private double area;
    public double getRadius() {
        return radius;
    }
    public double getFerence() {
        return ference;
    }
    public double getArea() {
        return area;
    }
    public void setRadius(double radius) {
        this.radius = radius;
        ference = 2 * Math.PI * this.radius;
        area = Math.PI * Math.pow(this.radius, 2);
    }
    public void setFerence(double ference) {
        this.ference = ference;
        radius = this.ference / (2 * Math.PI);
        area = Math.PI * Math.pow(this.radius, 2);
    }
    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(this.area / Math.PI);
        ference = 2 * Math.PI * this.radius;
    }
}