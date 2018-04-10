public class Pool {
    public static double[] calcPrice() {
        double[] arr = new double[] {0., 0.};
        final double radPool = 3.0, width = 1.0;
        final double price1 = 1000.0, price2 = 2000.0;
        Circle pool = new Circle();
        Circle track = new Circle();
        pool.setRad(radPool);
        track.setRad(radPool + width);
        arr[0] = (track.getAr() - pool.getAr()) * price1;
        arr[1] = track.getFer() * price2;
        return arr;
    }
    public static void main(String args[]) {
        double[] arr = calcPrice();
        System.out.printf("%.2f\n",arr[0]);
        System.out.printf("%.2f\n",arr[1]);
    }
}
