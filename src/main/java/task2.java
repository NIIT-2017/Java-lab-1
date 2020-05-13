class Sqrt
{
    static double delta= 0.00000001;
    static double arg;

    Sqrt(double arg) {
        Sqrt.arg = arg;
    }
    static double average(double x, double y) {
        return (x+y)/2.0;
    }
    static boolean good(double guess, double x) {
        return Math.abs(guess*guess-x)<delta;
    }
    static double improve(double guess, double x) {
        return average(guess,x/guess);
    }
    static double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public static double calc() {
        return iter(1.0,arg);
    }
}

public class task2
{
    public static void main(String[] args)
    {
        double val=Double.parseDouble(args[0]);
        Sqrt sqrt=new Sqrt(val);

        if (args.length > 1) {
            if (args[1].equals("a")) {
                Sqrt.delta = 1.0;
            } else if (args[1].equals("p")) {
                Sqrt.delta = 0.000000001;
            } else if (args[1].equals("d")) {
                Sqrt.delta = 0.00000001;
            }
        } else {
            System.out.println("Введите число и букву через пробел:");
            System.out.println("a - грубое вычисление");
            System.out.println("p - точное вычисление");
            System.out.println("d - вычисление по умолчанию");
            System.exit(0);
        }
        double result = Sqrt.calc();
        System.out.println("Sqrt of "+val+"="+result);
    }
}
