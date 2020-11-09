import java.math.*;
import java.util.Scanner;
class Sqrt
{
    double delta = 0.00000001;
    double arg;

    Sqrt(double arg)
    {
        this.arg = arg;
    }
    double average(double x ,double y) {
        return (x + y) / 2.0;
    }
    boolean good(double guess , double x)
    {
        return Math.abs(guess*guess -x)<delta;
    }
    double improve(double guess,double x)
    {
        return average(guess, x /guess);
    }
    double iter(double guess, double x)
    {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc()
    {
        return iter(1.0,arg);
    }

}

class Main
{
    public static strictfp void main(String args[])
         throws java.io.IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for calcilating");
        double val = Double.parseDouble(in.nextLine());
        System.out.println("Enter the accuracy which you want to get");
        MathContext accuracy = new MathContext(in.nextInt());
        Sqrt sqrt = new Sqrt(val);
        double result = sqrt.calc();
        BigDecimal total = new BigDecimal(result, accuracy);
        System.out.println("sqrt from " + val + " = " + total);
    }
}
