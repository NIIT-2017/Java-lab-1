public class Pull {
    public static double costtrack (int costonemetr)//   расчет стоимости дорожки
    {
        Circle pull = new Circle();
        pull.setRadius(3.0);
        Circle road = new Circle();
        road.setRadius(4.0);
        double resultprise = (road.getArea()-pull.getArea())*costonemetr;
        return resultprise;
    }
    public static double costfence (int costonemetr)// расчет стоимости ограды
    {
        Circle road = new Circle();
        road.setRadius(4.0);
        double resultprise = road.getFerence()*costonemetr;
        return resultprise;
    }

    public static void main(String[] args) {
        System.out.println("Стоимость дорожки - "+costtrack(1000)+"\n"+"Стоимость ограды - "+costfence(2000));
    }
}





