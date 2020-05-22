package HomeworkLab1;

public class Task7 {
    public  static  double func()
    {
        Circle pool=new Circle();
        pool.setRadius(3);
        Circle road=new Circle();
        road.setRadius(3+1);
        Circle fence=new Circle();
        fence.setFerence(road.getFerence());
        road.setArea(road.getArea()-pool.getArea());
        double roadCost=road.getArea()*1000;
        return roadCost+fence.getFerence()*2000;
    }
}
