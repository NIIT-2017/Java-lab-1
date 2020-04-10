package HomeworkLab1;

public class Task6 {
    public static  double main()
    {
        final  double earthRadius=6378.1;
        Circle c=new Circle();
        c.setRadius(earthRadius);
        double ference=c.getFerence()+0.001;
        c.setFerence(ference);
        return c.getRadius()-earthRadius;
    }
}
