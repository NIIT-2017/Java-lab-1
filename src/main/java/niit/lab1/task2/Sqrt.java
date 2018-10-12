package niit.lab1.task2;

public class Sqrt {
//    double delta=0.00000001;
    double delta;
    double arg;

    public Sqrt(double arg) {
        this.arg=arg;
    }

    public Sqrt(double val, double delta) {
        this.arg=val;
        this.delta=delta;
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
