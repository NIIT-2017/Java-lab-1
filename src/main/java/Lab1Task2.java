class Sqrt
{
    private double delta;
    private double arg;
//the constructor
    Sqrt(double arg, double delta) {
        this.arg=arg;
        this.delta=delta;
    }
//the methods
    double average(double x,double y) {
        return (x+y)/2.0;
    }
    boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<delta;
    }
    double improve(double guess,double x) {
        return average(guess,x/guess);
    }
    double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc() {
        return iter(1.0,arg);
    }
}

public class Lab1Task2 {
    public static void main(String[] args)
    {
        double val=Double.parseDouble(args[0]);
        double del=Double.parseDouble(args[1]);
        Sqrt sqrt=new Sqrt(val,del);
        double result=sqrt.calc();
        System.out.println("Sqrt of "+val+"="+result);
    }
}
