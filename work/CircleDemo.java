public class CircleDemo {

    public static void main(String[] args){

        Circle circle1 = new Circle();
        circle1.setRadius(6378100);
        double R1 = circle1.getRadius();
        System.out.println("Radius = " + circle1.getRadius());
        System.out.println("Ference = " +circle1.getFerence());
        System.out.println("Area = " + circle1.getArea());
        circle1.setFerence(circle1.getFerence()+1);
        System.out.println();
        double R2 = circle1.getRadius();
        System.out.println("New Radius = " + circle1.getRadius());
        System.out.println("New Ference = " +circle1.getFerence());
        System.out.println("New Area = " + circle1.getArea());
        System.out.println();
        System.out.println("Difference " +(R2-R1)*1000 + " mm");
        System.out.println();

        Waterpool waterpool = new Waterpool();
        waterpool.calculate();
    }
}
