class Circle {
    private double Radius;  //радиус
    private double Ference;  //длина окружности (=2*Pi*R)
    private double Area;  //площадь круга (=Pi*R*R)

    //методы доступа к переменным экземпл¤ра
    //(геттеры и сеттеры):
    double getRadius() {
        return Radius;
    }

    double getFerence() {
        return Ference;
    }

    double getArea() {
        return Area;
    }

    void setRadius(double R) {
        Radius = R;
        Ference = 2 * Math.PI * Radius;
        Area = Math.PI * Radius * Radius;
    }

    void setFerence(double F) {
        Ference = F;
        Radius = Ference / (2 * Math.PI);
        Area = Math.PI * Radius * Radius;
    }

    void setArea(double A) {
        Area = A;
        Radius = Math.sqrt(Area / Math.PI);
        Ference = 2 * Math.PI * Radius;
    }
}


class EarthAndRope extends Circle {
    private double additive; // добавленный кусок верёвки

    // конструктор
    EarthAndRope(double R, double add) {
        setRadius(R);
        additive = add;
    }

    double gap() {
        double earthRadius = getRadius();
        setFerence(getFerence() + additive);
        double changedRadius = getRadius() - earthRadius;
        return changedRadius;
    }

    void showGap() {
        System.out.printf("Зазор между поверхностью земли и верёвкой равен %.3f м. \n", gap());
    }
}


class Waterpool extends Circle {
    private double roadWidth; // ширина дорожки
    private double PavementOneSquareMeterCost;  // стоимость 1 квадратного метра бетонного покрытия
    private double FenceOneMeterCost; // стоимость 1 погонного метра ограды
    double waterpoolArea;

    // конструктор
    Waterpool(double R, double rw, double cpc, double fc) {
        setRadius(R);
        roadWidth = rw;
        PavementOneSquareMeterCost = cpc;
        FenceOneMeterCost = fc;
        waterpoolArea = getArea();
        setRadius(getRadius() + roadWidth);
    }



    double pavementCost() {
        double pavementArea = getArea() - waterpoolArea;
        double pavementCost = pavementArea * PavementOneSquareMeterCost;
        return pavementCost;
    }

    double fenceCost() {
        double fenceCost = getFerence() * FenceOneMeterCost;
        return fenceCost;
    }

    void showPavementCost() {
        System.out.printf("Стоимость материалов для бетонной дорожки составляет %.2f руб. \n", pavementCost());
    }

    void showFenceCost() {
        System.out.printf("Стоимость материалов для ограды вокруг бассейна с дорожкой составляет %.2f руб. \n", fenceCost());
    }

}


public class Task6 {
    public static void main(String args[]){
        EarthAndRope task1 = new EarthAndRope(6378.1*1000, 1); // в параметрах указываем величины в метрах
        task1.gap();
        task1.showGap();

        System.out.println();

        Waterpool task2 = new Waterpool(3, 1, 1000, 2000);  // в параметрах указываем величины в метрах и рублях
        task2.pavementCost();
        task2.fenceCost();
        task2.showPavementCost();
        task2.showFenceCost();
    }
}