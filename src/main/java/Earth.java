public class Earth {
    public static double calcRadDiff() {
        final double earthRad = 6378100;
        double radDiff = 0.;
        Circle earth = new Circle();
        earth.setRad(earthRad);
        earth.setFer(earth.getFer() + 1.);
        radDiff = earth.getRad() - earthRad;
        return radDiff;
    }
    public static void main() {
        System.out.println(calcRadDiff());
    }
}
