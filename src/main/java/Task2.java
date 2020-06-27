public class Task2 {
    double delta=0.0000001;
    double arg;

    Task2(double arg, double delta) {
        this.arg=arg;
        this.delta=delta;
    }
    Task2(double arg) {
        this.arg=arg;
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