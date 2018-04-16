 class Circle {

        private  double Radius ;
        private  double Ference;
        private  double Area;

     public Circle(double Radius, double Ference, double Area) {
         this.Radius = Radius;
         this.Ference=Radius;
         this.Area=Radius;

     }


     public void setRadius (double Radius){
            this.Radius=Radius;
            this.Ference = 2 * Math.PI * Radius;
            this.Area = Math.pow(Radius, 2) * Math.PI;
        }
        public double getRadius() {
            return Radius;
        }

        public void setFerence ( double Ference){
            this.Ference=Ference;
            this.Radius = Ference / (2*Math.PI);
            this.Area = Math.pow(Radius, 2) * Math.PI;
        }
        public double getFerence(){
            return Ference;
        }


        public void setArea (double Area){
            this.Area=Area;
            this.Radius = Math.sqrt(Area / Math.PI);
            this.Ference = 2 * Math.PI * Radius;
        }
        public double getArea() {
            return Area;
        }
}

    public class CircleDemo {
        public static void main(String args[]) {
    //task "The Earth and Rope"
        System.out.println("Task 'The Earth and Rope'");
        Circle ExistParamOfEarth=new Circle(0.0,0.0,0.0);
        Circle NewParamWithRope=new Circle(0.0,0.0,0.0);


        ExistParamOfEarth.setRadius(6378100.0);
        System.out.println("Ference of the Earth is " +ExistParamOfEarth.getFerence()+" m");
        NewParamWithRope.setFerence(ExistParamOfEarth.getFerence()+1.0);
        System.out.println("New ference:"+ NewParamWithRope.getFerence());


        //System.out.println("Radius rope is: " +NewParamWithRope.getRadius()+" m");
        //System.out.println("Radius earth is: " +ExistParamOfEarth.getRadius()+" m");
        double GapBetweenEarthAndRope=NewParamWithRope.getRadius()-ExistParamOfEarth.getRadius();
        System.out.println("Gap between surface and rope is: "+
        GapBetweenEarthAndRope+" m");



    //task "Pool"
        System.out.println("Task 'Pool'");
        Circle Pool=new Circle(0.0,0.0,0.0);
        Circle PathAroundPool=new Circle(0.0,0.0,0.0);
        Circle FenceAroundPool=new Circle(0.0,0.0,0.0);
        Circle PoolAndPath=new Circle(0.0,0.0,0.0);

        Pool.setRadius(3.0);
        PathAroundPool.setRadius(1.0);
        PoolAndPath.setRadius(Pool.getRadius()+PathAroundPool.getRadius());
        double PathArea=PoolAndPath.getArea()-Pool.getArea();
       // System.out.println(PathArea);
        FenceAroundPool.setRadius(PoolAndPath.getRadius());
        //System.out.println(FenceAroundPool.getFerence());
        double priceForFence=FenceAroundPool.getFerence()*2000.0;
        double priceForPath=PathArea*1000.0;

        System.out.println("Price fence is :"+Math.round(priceForFence)+" rub");
        System.out.println("Price  path around pool is :"+Math.round(priceForPath)+" rub");

    }
}