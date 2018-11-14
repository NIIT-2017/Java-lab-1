public class Pool {
    public static final double sidewalkWidth = 1.0;
    public static final double poolRadius = 3.0;
    public static final double priceOfFence = 2000.0;
    public static final double priceOfSidewalk = 1000.0;

    public static void main(){
        final double result = getResult();
    }
    public static double getResult(){
        double result = 0;
        Circle pool = new Circle();
        Circle fence = new Circle();
        pool.setRadius(poolRadius);
        fence.setRadius(poolRadius + sidewalkWidth);
        return ((fence.getArea() - pool.getArea()) * priceOfSidewalk) + (fence.getFerence() * priceOfFence);
    }
}
