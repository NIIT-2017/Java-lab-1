public class Sqrt {

    double delta=0.00000001;
    double arg;

    Sqrt(double arg) {
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
    public void setDelta(double d){
        this.delta = d;
    }
    /*public static void main(String args[]) {
        Sqrt sqrt = new Sqrt(2);
        sqrt.setDelta(0.1);
        double result = sqrt.calc();
        System.out.println(result);
    }*/
}
