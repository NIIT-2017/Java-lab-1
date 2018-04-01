/**
 * Created by khvostovai on 27.03.2018.
 */
public class EarthAndRope {
    static final double radiusEarth = 6378.1;
    public static void main(String[] args) {
        CircleDemo Earth = new CircleDemo(radiusEarth);//сотворение земли
        Earth.setFerence(Earth.getFerence()+1.0);//увеличим длинну на один метр
        System.out.println("Растояние между зелмей и веревкой примерно "+(Earth.getRadius()-radiusEarth)+" м");
    }
}
