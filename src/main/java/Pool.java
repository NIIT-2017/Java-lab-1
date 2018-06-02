public class Pool {

    public static void main(String[] args) {
        double priceCover = 1000;
        double priceFence = 2000;

        Circle poll = new Circle();
        double radiusPoll = 3.0;//радиус бассейна
        poll.setRadius(radiusPoll);//создаем бассейн с радиусом radiusPoll
        Circle pollAndCover = new Circle();
        double radiusPollAndCover = 3.0 + 1.0;//радиус бассейна и дорожки
        pollAndCover.setRadius(radiusPollAndCover);//создаем бассейн+ дорожу с радиусом radiusPollAndCover
        double cover = (pollAndCover.getArea() - poll.getArea()) * priceCover;
        System.out.println(String.format("%(.2f - цена дорожки", cover));
        System.out.println(String.format("%(.2f - цена ограды", pollAndCover.getFerence() * priceFence));
    }
}
