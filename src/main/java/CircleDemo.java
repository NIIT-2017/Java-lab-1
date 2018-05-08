public class CircleDemo
{
    public static double exercise1Math(double radius, double deltaFerence) {
        Circle circ1 = new Circle(Circle.ParamName.RADIUS, radius);
        Circle circ2 = new Circle(Circle.ParamName.FERENCE,circ1.getParam(Circle.ParamName.FERENCE) + deltaFerence);
        return (circ2.getParam(Circle.ParamName.RADIUS) - circ1.getParam(Circle.ParamName.RADIUS)) * 1000 * 100;
    }
    public static double[] exercise2Math(double radiusPool, double widthTrack, double price1smTrack, double price1lmFence) {
        Circle circ1 = new Circle(Circle.ParamName.RADIUS, radiusPool);
        Circle circ2 = new Circle(Circle.ParamName.RADIUS,radiusPool + widthTrack);
        double priceTrack = price1smTrack * (circ2.getParam(Circle.ParamName.AREA) - circ1.getParam(Circle.ParamName.AREA));
        double priceFence = price1lmFence * circ2.getParam(Circle.ParamName.FERENCE);
        double prices[] = {priceTrack, priceFence};
        return prices;
    }
    public static double exercise1Res() {
        return exercise1Math(6378.1, 0.001);
    }
    public static double[] exercise2Res() {
        return exercise2Math(3, 1, 1000, 2000);
    }
    public static String exercise1Str(double radius, double deltaFerence) {
        double result = exercise1Math(radius, deltaFerence);
        return ("Зазор равен " + String.format("%(.2f", result) + " сантиметров." + "\n");
    }
    public static String exercise2Str(double radiusPool, double widthTrack, double price1smTrack, double price1lmFence) {
        double results[] = exercise2Math(radiusPool, widthTrack, price1smTrack, price1lmFence);
        return ("Стоимость дорожки и ограды равны " + String.format("%(.2f", results[0]) +
        " и " + String.format("%(.2f", results[1]) + " рублей." + "\n");
    }
    public static String exercise1() {
        return exercise1Str(6378.1, 0.001);
    }
    public static String exercise2() {
        return exercise2Str(3, 1, 1000, 2000);
    }
    public static String exercises() {
        return exercise1().concat(exercise2());
    }
    public static void show(String message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        show(exercises());
    }
}
