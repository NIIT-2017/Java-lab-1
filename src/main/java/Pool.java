/**
 * Created by khvostovai on 27.03.2018.
 */
public class Pool {
    static final int priceCover = 1000;
    static final int priceFence = 2000;
    public static void main(String[] args) {
        CircleDemo poll = new CircleDemo(3.0);
        CircleDemo pollAndCover = new CircleDemo(3.0+1.0);
        double cover = (pollAndCover.getArea()-poll.getArea())*priceCover;
        System.out.println(String.format("%(.2f - цена дорожки",cover));
        System.out.println(String.format("%(.2f - цена ограды",pollAndCover.getFerence()*priceFence));
    }
}
