public class SqrtSetOn {
    public static void main(String[] args)
    {
        Sqrt sqrt=new Sqrt(Double.parseDouble(args[0]));
        System.out.println("Sqrt of "+sqrt.getArg()+"="+sqrt.calc(Integer.parseInt(args[1])));
    }
}

class Sqrt
{
    private double delta=1;
    private double arg;

    public double getArg(){ return arg; }

    Sqrt(double arg) {
        this.arg=arg;
    }

    //set the precision
    private void setPrecision(int precision){
        for (int i = 0; i < precision; i++)
            delta *= 0.1;
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
    public double calc(int precision) {
        setPrecision(precision);
        return iter(1.0,arg);
    }
}
