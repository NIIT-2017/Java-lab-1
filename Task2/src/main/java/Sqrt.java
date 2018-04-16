class Sqrt
{
    double delta;//precision
    double arg;

    Sqrt(double arg,double delta) {
        this.arg=arg;
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

class Program
{
    public static void main(String[] args) throws Exception {
        double val=Double.parseDouble(args[0]);
        if(val<=0){
            throw new Exception("You should input number greater than 0!");
        }
      //  double delta=Double.parseDouble(args[1]);
        double precise=Double.parseDouble(args[1]);

        Sqrt sqrt = new Sqrt(val,precise);
        double result=sqrt.calc();
        System.out.printf("Sqrt of  %s is %s",val,result);
    }
}