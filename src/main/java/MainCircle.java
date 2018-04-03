public class MainCircle{
    public static void main(String[] args){
        //Задача "Земля и верёвка"
        Circle planetEarth = new Circle();  //Создаём объект планета земля класса Circle
        final double radiusEarth = 6378.1;  //В километрах
        planetEarth.setRadius(radiusEarth * 1000);  //Задаём радиус планеты Земля в м
        Circle objNew = new Circle();   //Создаём новый объект класса Circle
        objNew.setFerence(planetEarth.getFerence() + 1);   //Задаё длинну окружности нового объекта на метр больше чем у планеты Земля
        System.out.print("The variation of the radius made up: " + (Math.abs(planetEarth.getRadius() - objNew.getRadius())) + " m\n");
        //Задача "Бассейн"
        final int priceBeton = 1000;  //Стоиместь одного квадратного метра бетоннного покрытия
        final int priceBarer = 2000;  //Стоимось погонного метра ограды
        final int radiusBas = 3; //м
        final int widthRoad = 1; //м
        Circle bas = new Circle();
        bas.setRadius(radiusBas);   //Задаём радиус бассейна
        Circle road = new Circle();
        road.setRadius(radiusBas + widthRoad);
        double area = Math.abs(road.getArea() - bas.getArea()); //Вычисляем площадь бетонной дорожки
        double barer = bas.getFerence() + road.getFerence(); //Вычисляем суммарную длинну ограждения бассейна и дорожки

        System.out.print("The cost of materials necessary for the construction of the pool fence and walkway is: " + priceBarer * barer + " r\n" +
                "The cost of materials required for the construction of a concrete path around the pool is: " + area * priceBeton + " r\n");
    }
}
