package niit.lab1.task6;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CircleDemo {
    public static void main(String[] args) {
//        task 1
//        +1 м
//        6378.1 км
        Circle task1 = new Circle(0,0,0);
//        System.out.println(circle.getRadius()+" "+circle.getFerence()+" "+circle.getArea());
        task1.setRadius(1);
//        System.out.println(circle.getRadius()+" "+circle.getFerence()+" "+circle.getArea());
        double earthRadius = 6378.1;
        task1.setRadius(6378.1);
        task1.setFerence(task1.getFerence()+0.001);
        double gap = task1.getRadius() - earthRadius;
        System.out.println(gap);

//        task 2
//        r = 3
//        +1;
//        1 кв м бетонного покрытия = 1000 р.;
//        1 погонн метр ограды = 2000 р.;

//        ? стоимость материалов для бетонной дорожки вокруг круглого бассейна
//        ? стоимость материалов ограды вокруг бассейна (вместе с дорожкой)
        Circle task2 = new Circle(0,0,0);
        task2.setRadius(3);
        double poolArea = task2.getArea();
        task2.setRadius(3+1);
        double poolAreaWithTrackArea = task2.getArea();
        double trackArea = poolAreaWithTrackArea - poolArea;
        double concretePrice = 1000;
        double fencePrice = 2000;
        double poolWithTrackFerence = task2.getFerence();
        double concreteCost = concretePrice * trackArea;
        double fenceCost = fencePrice * poolAreaWithTrackArea;

        String totalCost = String.valueOf(fenceCost + concreteCost);
        String totalCostRounded = "";
        if (totalCost.indexOf('.') != -1)
            totalCostRounded = totalCost.substring(0,totalCost.indexOf('.')+3);

        System.out.println("Total cost is " + totalCostRounded + " rub.");
    }
}
