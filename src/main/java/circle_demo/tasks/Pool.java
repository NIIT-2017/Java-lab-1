package circle_demo.tasks;

import circle_demo.circle.Circle;

public class Pool {

    private Circle circle;

    public Pool(){
        circle = new Circle();
    }

    public double countTrackPrice(double poolRadius, double trackWidth, double betonPrice){
        double track = 0;
        try{
            if (poolRadius<0||trackWidth<0||betonPrice<0)
                throw new NumberFormatException();
            circle.setRadius(poolRadius);
            double poolArea = circle.getArea();
            circle.setRadius(poolRadius+trackWidth);
            double trackArea = circle.getArea()-poolArea;
            track = trackArea*betonPrice;
        } catch (NumberFormatException nfe){
            System.err.println("Расчет стоимости бетонной дорожки не выполнен! Введено отрицательное значение!");
        }
        return track;
    }

    public double countFencePrice(double poolRadius, double fencePrice){
        double fence = 0;
        try {
            if (poolRadius<0||fencePrice<0)
                throw new NumberFormatException();
            circle.setRadius(poolRadius);
            fence = circle.getCircumference()*fencePrice;
        }catch (NumberFormatException nfe){
            System.err.println("Расчет стоимости ограды не выполнен! Введено отрицательное значение!");
        }
        return fence;
    }
    public static void main(String[] args){
        Pool pool = new Pool();
        double track = pool.countTrackPrice(1, 1, 1000);
        double fence = pool.countFencePrice(1, 1000);
        System.out.printf("Стоимость бетонной дорожки: "+"%.2f",track);
        System.out.print(" рублей \n");
        System.out.printf("Стоимость ограды: "+"%.2f",fence);
        System.out.print(" рублей");
    }
}

