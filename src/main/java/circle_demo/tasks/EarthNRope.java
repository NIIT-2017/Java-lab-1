package circle_demo.tasks;

import circle_demo.circle.Circle;

public class EarthNRope {

    final static double EARTH_CIRCUMFERENCE = 6378.1;//километров

    private Circle circle;

    public EarthNRope(){
        circle = new Circle();
    }

    public double countGap(double delta){
        if (delta<0) throw new NumberFormatException();
        circle.setCircumference(EARTH_CIRCUMFERENCE);
        double earthRadius = circle.getRadius();
        double ropeCircumference = EARTH_CIRCUMFERENCE + delta;
        circle.setCircumference(ropeCircumference);
        double ropeRadius = circle.getRadius();
        double gap = ropeRadius - earthRadius;
        return gap;
    }

    public static void main(String [] args){
        EarthNRope earthNRope = new EarthNRope();
        try {
            double gap = earthNRope.countGap(-0.001);
            System.out.println(gap*1000+" метра");
        }catch (NumberFormatException nfe){
            System.err.println("Введено отрицательное значение приращения веревки! Введите положительное число.");
        }

    }
}
