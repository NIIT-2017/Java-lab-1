package sqrt;

public class Sqrt
{
    private double delta;//=0.00000001;
    private double arg;

    public Sqrt(double arg, double delta) {
        this.arg=arg;
        this.delta=delta;
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
    public double calc() {
        return iter(1.0,arg);
    }

    public static void main(String[] args) {
        try {
            double val = Double.parseDouble(args[0]);
            if (val<0) throw new NumberFormatException();
            double precision = Double.parseDouble(args[1]);
            Sqrt sqrt = new Sqrt(val, precision);
            double result = sqrt.calc();
            System.out.println("Sqrt of " + val + "=" + result + "( precision=" + precision + " )");
        }catch (NumberFormatException nfe){
            System.err.println("Введены неверные символы!");
            System.out.println("Введите неотрицательное число в качестве аргумента корня \n" +
                    " и, через пробел, точность в виде десятичной дроби больше 0, но меньше 1.\n Например: [2 0.0001]");
        }
    }
}
