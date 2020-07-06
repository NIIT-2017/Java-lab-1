public class Program
{
    public static void main(String[] args)
    {
        double val1=Double.parseDouble(args[0]);
        double val2=Double.parseDouble(args[1]);
        Sqrt sqrt=new Sqrt(val1, val2);
        double result=sqrt.calc();
        System.out.println("Sqrt of "+val1+" = "+result);
    }
}

class Sqrt
{
    double delta;
    double arg;

    Sqrt(double arg0, double arg1) {
        this.arg=arg0;
        this.delta=arg1;
    }
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
