class Sqrt
{
    double delta;
    double arg;

    Sqrt(double arg) {
        this.arg=arg;
        this.delta = 0.00000001;
    }
    Sqrt(double arg, double delta) {
        this.arg=arg;
        this.delta = delta;
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
    public double calc(double acc) {
        this.delta = acc;
        return iter(1.0,arg);
    }
    public double calc() {
        return iter(1.0,arg);
    }
}

class Program
{
    public static void main(String[] args)
    {
        double val=Double.parseDouble(args[0]);
        double acc = Double.parseDouble(args[1]);
        Sqrt sqrt=new Sqrt(val);
        double result=sqrt.calc(acc);
        System.out.println("Sqrt of "+val+"="+result);
    }
}
