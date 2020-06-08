class Sqrt {
    double delta;
    double arg;

    Sqrt(double arg, double delta) {
        this.arg = arg;
        this.delta = delta;
    }

    double avarage(double x, double y){
        return (x+y)/2.0;
    }

    boolean good(double guess, double x) {
        return Math.abs(guess*guess-x)<delta;
    }

    double improve(double guess, double x){
        return avarage(guess,x/guess);
    }

    double iter (double guess, double x){
        if (good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc(){
        return iter(1.0,arg);
    }
}

public class Task2 {
    public static void main (String[] args){
        double val = Double.parseDouble(args[0]);
        double del = Double.parseDouble(args[1]);
        Sqrt sqrt = new Sqrt(val, del);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + "=" + result);
    }
}