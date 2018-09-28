public class task2 {
    public static void main(String[] args)
    {
        double val=Double.parseDouble(args[0]);
        double delta=Double.parseDouble(args[1]);
        double result=Sqrt(val, delta);
        System.out.println("Sqrt of "+val+"="+result);
    }
    static double Sqrt(double val, double delta){
        Sqrt sqrt=new Sqrt(val, delta);
        return sqrt.calc();
    }
}
class Sqrt
{
    private double delta;
    private double arg;

    Sqrt(double arg, double delta) {
        this.arg=arg;
        this.delta=delta;
    }
    private double average(double x,double y) {
        return (x+y)/2.0;
    }
    private boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<delta;
    }
    private double improve(double guess,double x) {
        return average(guess,x/guess);
    }
    private double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc() {
        return iter(1.0,arg);
    }
}
