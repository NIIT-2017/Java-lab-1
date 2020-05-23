public class Task6 {
    private double radius;
    private double circumference;
    private double area;


    public void paymentFerenceArea(double radius){
        circumference =2*Math.PI*radius;
        area=Math.PI*radius*radius;
    }

    public void paymentRadiusArea(double ference){
        radius=(ference)/(2*Math.PI);
        area=Math.PI*radius*radius;
    }

    public void paymentRadiusFerence(double area){
       double value=area/Math.PI;
       double delta=0.0001;

       Task2 task2InTask6=new Task2(delta,value);
       radius=task2InTask6.calc();
       circumference =2*Math.PI*radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getCircumference(){
        return circumference;
    }

    public double getArea(){
        return area;
    }
}

class Land{
    public static void main(String[] args) {
        double radiusLand=6378.1; //[km]

        Task6 objLand = new Task6();
        objLand.paymentFerenceArea(radiusLand);
        double ferenceRope=objLand.getCircumference()+0.001; //[km]

        Task6 objRope=new Task6();
        objRope.paymentRadiusArea(ferenceRope);
        double deltaRkm=objRope.getRadius()-radiusLand; //[km]
        double deltaRm=deltaRkm*1000; //[m]
        System.out.println("Clearance between Land and the rope ="+deltaRm+" m.");
    }
}

class Prise {
    public static void main(String[] args) {

        int priseConcrete = 1000; //[p/m*m]
        int priseFence = 2000;    //[p/m]
        double radiusPool = 3.0; //[m]
        double roadWidth = 1.0;  //[m]
        double radiusFence = radiusPool + roadWidth; //[m]

        Task6 forPool = new Task6();
        forPool.paymentFerenceArea(radiusPool);
        Task6 forRoad=new Task6();
        forRoad.paymentFerenceArea(radiusFence);

        int priseConcretePool= (int) (priseConcrete*(forRoad.getArea()-forPool.getArea()));
        int priseFencePool=(int)(priseFence*forRoad.getCircumference());
        int priseAll=(int)(priseConcretePool+priseFencePool);

        //System.out.println("Prise concrete for the pool="+priseConcretePool+" p");
        //System.out.println("Prise fence for the pool="+priseFencePool+" p");
        System.out.println("Prise all for the pool="+priseAll+" p");
    }
}