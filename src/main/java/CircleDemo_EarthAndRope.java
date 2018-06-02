public class CircleDemo_EarthAndRope {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double radiusEarth = 6378.1;//радиус земли
        circle.setRadius(radiusEarth);// создаем землю с радиусом radiusEarth
        circle.setFerence(circle.getFerence()+1.0);//увеличиваем диаметр веревки на 1 метр

       System.out.println("Зазор между поверхностью земли и верёвкой равен" + " " + (circle.getRadius() - radiusEarth) );

    }
}
