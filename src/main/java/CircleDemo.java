public class CircleDemo
{
    public static void exercise1(double radius, double deltaFerence) {
        Circle circ1 = new Circle(Circle.ParamName.RADIUS, radius);
        Circle circ2 = new Circle(Circle.ParamName.FERENCE,circ1.getParam(Circle.ParamName.FERENCE) + deltaFerence);
        double deltaRadius = circ2.getParam(Circle.ParamName.RADIUS) - circ1.getParam(Circle.ParamName.RADIUS);
        System.out.println("Зазор равен " + deltaRadius * 1000 * 100 + " сантиметров");
    }
    public static void exercise2(double radiusPool, double widthTrack, double price1smTrack, double price1lmFence) {
        Circle circ1 = new Circle(Circle.ParamName.RADIUS, radiusPool);
        Circle circ2 = new Circle(Circle.ParamName.RADIUS,radiusPool + widthTrack);
        double priceTrack = price1smTrack * (circ2.getParam(Circle.ParamName.AREA) - circ1.getParam(Circle.ParamName.AREA));
        double priceFence = price1lmFence * circ2.getParam(Circle.ParamName.FERENCE);
        System.out.println("Стоимость дорожки и ограды равны " + priceTrack + " и " + priceFence + " рублей");
    }
    public static void main(String[] args) {
        exercise1(6378.1,0.001);
        exercise2(3,1,1000,2000);
    }
}
