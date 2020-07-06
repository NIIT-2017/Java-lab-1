public class Task6.2 {

    public static double poolPrice(double trackPrice, double fencePrice){
        Circle pool = new Circle();
        Circle track = new Circle();
        pool.setRadius(3);
        track.setRadius(pool.getRadius()+1);
        double trackArea = track.getArea() - pool.getArea();
        double totalPrice = trackArea * trackPrice + track.getFerence() * fencePrice;
        return totalPrice;
    }
    public static void main(String[] args) {
        System.out.println("Total price = " + poolPrice(1000, 2000) + " rub;");
    }
}