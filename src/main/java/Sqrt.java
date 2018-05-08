public class Sqrt
{
    final double delta;
    private double arg;
    Sqrt(double arg, int signs) {
        this.arg=arg;
        delta=Math.pow(10,-signs);
    }
    public double getArg() {
        return arg;
    }
    double average(double x, double y) {
        return (x + y) / 2.0;
    }
    boolean good(double guess, double x) {
        return Math.abs(guess * guess - x) < delta;
    }
    double improve(double guess, double x) {
        return average(guess,x / guess);
    }
    double iter(double guess, double x) {
        if(good(guess, x)) return guess;
        else return iter(improve(guess, x), x);
    }
    public double calc() {
        return iter(1.0, arg);
    }
}
