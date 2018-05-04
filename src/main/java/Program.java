class Sqrt
{
    double delta = 1.0;
    double arg;

    Sqrt(double arg, double accuracy) {
        this.arg=arg;
        for (int i=0;i<accuracy;i++)
        this.delta/=10;
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

class Program
{
    public static void main(String[] args)
    {
        double val=Double.parseDouble(args[0]);
        //double val=4;
        double delta=Double.parseDouble(args[1]);
        //double delta=15;
        Sqrt sqrt=new Sqrt(val, delta);
        double result=sqrt.calc();
        System.out.println("Sqrt of "+val+"="+result);
    }
}