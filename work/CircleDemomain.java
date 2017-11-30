//Лабораторный практику№1 задача№6


public class CircleDemomain {
    public static void main (String args[]){

//------------------------Решение задачки Земля и веревка-----------------------------------------
        double deltaS;                      //ответ

        Circle eath = new Circle();         //создаем объект земля
        Circle rope = new Circle();         //создаем объект веревка

        eath.setRadius(6378100);    //радиус земли в метрах
        rope.setRadius(eath.getRadius()+1);       //радиус веревки в метрах
        //ответ - площадь веревки минус площать земли
        deltaS = rope.getArea() - eath.getArea();
        System.out.println("----------задача№1: земля и веревка--------------");
        System.out.println("Площадь зазора: " + deltaS + " метра");
        System.out.println("--------------------------------------------------");

//--------------------------Решение задачки бассейн------------------------------------------------

        Circle pool = new Circle();         //содали объект бассейн
        Circle fence = new Circle();        //создали объект бетонная дорожка

        int roadprice = 1000;                      //цена бетонной дорожки 1 кв.м.
        int fenceprice = 2000;                     //цена забора 1м.

        pool.setRadius(3);                          //радиус бассена
        fence.setRadius(4);                         //радиус забора

        System.out.println("-------------задача№2: бассейн-----------------");
        System.out.println("Цена бетонной дорожки: " + roadprice * (fence.getArea() - pool.getArea()) + " рублей");
        System.out.println("Цена забора: " + fenceprice * fence.getFerence() + " рублей");

    }
}
