public class Task2Sqrt {
    public static void main(String[] args) {
        double val = Double.parseDouble(args[0]);
        //double val = 256;
       // double precision = 0.00000001;
        double precision = Double.parseDouble(args[1]);
        Sqrt object = new Sqrt(val, precision);
        double result = object.calc();
        System.out.print("Sqrt of " + val + " = " +result+ " (with precision to " + precision + ")");
    }
}
class Sqrt
{
    double arg = 0;
    double delta = 0;

    Sqrt(double val, double precision){
       arg = val;
       delta = precision;
    }

    double average(double x,double y) {
        return (x + y) / 2.0;
    }
    boolean good(double guess,double x) {
        return Math.abs(guess * guess - x) < delta;
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
