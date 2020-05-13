import java.util.Scanner;

public class Sqrt {
    double delta;
    double arg;

    public Sqrt (double delta, double arg) {
        this.delta = delta;
        this.arg = arg;
    }
    double average(double x, double y) {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter delta, which set accuracy of calculation: ");
            double delta = in.nextDouble();
            System.out.print("Enter your number for calculation: ");
            double number = in.nextDouble();
            Sqrt sqrt = new Sqrt(delta, number);
            double result = sqrt.calc();
            System.out.println("Sqrt of " + number + "=" + result);
    }
}
