public class Waterpool {

    public static void calculate(){

        Circle circleWaterpool = new Circle();
        circleWaterpool.setRadius(3);
        Circle circleLane = new Circle();
        circleLane.setRadius(4);
        double costLane = (circleLane.getArea() - circleWaterpool.getArea())*1000;
        System.out.println("Cost of lane " + costLane);
        double costHedge = circleLane.getFerence()*2000;
        System.out.println("Cost of hedge " + costHedge);
    }

}
