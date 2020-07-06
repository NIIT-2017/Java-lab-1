import java.math.BigDecimal;
import java.util.Scanner;

class Sqrt {
    double delta;
    double arg;

    Sqrt(double arg, double delta) {
        this.arg = arg;
        this.delta = delta;
    }
    double average (double x, double y) {
        return (x + y) /2.0;
    }
    boolean good (double guess, double x) {
        return Math.abs (guess * guess-x) <delta;
    }
    double improve (double guess, double x) {
        return average (guess, x / guess);
    }
    double iter (double guess, double x) {
        if (good (guess, x))
            return guess;
        else
            return iter (improve (guess, x), x);
    }
    public double calc () {
        return iter (1.0, arg);
    }
}

class Program
{
    public static void main(String[] args)
    {
        System.out.println("Введите число для вычисления корня");
        Scanner console = new Scanner(System.in);
        double val=console.nextDouble();
        System.out.println("Какое число знаков после запятой");
        int del=console.nextInt();
        Sqrt sqrt=new Sqrt(val,del);
        double result=sqrt.calc();
        System.out.println(BigDecimal.valueOf(result).setScale(del, BigDecimal.ROUND_HALF_UP));
    }
}
