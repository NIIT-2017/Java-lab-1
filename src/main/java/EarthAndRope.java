public class EarthAndRope extends Circle{
    private double result;
    static final double earthRadius = 6378100;
    static final double oneMeter = 1.0;

    public static void main(){
        final double result = getResult();
    }
    public static double getResult(){
        Circle earth = new Circle();
        Circle extendedEarth = new Circle();
        earth.setRadius(earthRadius);
        extendedEarth.setFerence(earth.getFerence() + oneMeter);
        double result = extendedEarth.getRadius()-earthRadius;
        System.out.println(result);
        return result;
    }
}
