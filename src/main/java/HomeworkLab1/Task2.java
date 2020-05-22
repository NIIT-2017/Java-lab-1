package HomeworkLab1;
public class Task2 {
    static double delta=0.00000001;
    void setDelta(double d)
    {
        delta=d;
    }
    static double average(double x,double y) {
        return (x+y)/2.0;
    }
    static boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<delta;
    }
    static double improve(double guess,double x) {
        return average(guess,x/guess);
    }
    static double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    static double sqrt(double arg)
    {
        return iter(1.0,arg);
    }
    public  static  double sqrt(double arg,double delta)
    {
        Task2.delta=delta;
        return sqrt(arg);
    }
}
