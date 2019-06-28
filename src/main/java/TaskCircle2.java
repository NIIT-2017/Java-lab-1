public class TaskCircle2 {
    public static void main(String[] args){
        double radPool=3.0;
        double radfence=radPool+1;
        Circle pool = new Circle();
        Circle fence = new Circle();
        pool.setRadius(radPool);
        fence.setRadius(radfence);
        double fenceCost = 2000*fence.getFerence();
        double walkwayCost = 1000*(fence.getArea()-pool.getArea());
        System.out.printf("the cost of the fence - %.2f\n", fenceCost);
        System.out.printf("the cost of the track - %.2f\n", walkwayCost);
    }
}
