public class Task6.1 {

    public static double earthAndRope(double earthRad) {
        Circle rope = new Circle();
        Circle earth = new Circle();
        earth.setRadius(earthRad);
        rope.setFerence(earth.getFerence() + 1);
        double ropeRad = rope.getRadius();
        return ropeRad - earthRad;
    }

    public static void main(String[] args) {
        System.out.println("Clearance is" + earthAndRope(6378100) + " meters;");
    }
}
