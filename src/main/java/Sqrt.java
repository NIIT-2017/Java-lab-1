import java.util.HashMap;

class Sqrt {
    double delta;
    double arg;

    Sqrt(double arg, int numberOfDecimalPlaces) {
        this.arg = arg;
        this.delta = 1 / Math.pow(10, numberOfDecimalPlaces);
    }

    double average(double x, double y) {

        return (x + y) / 2.0;
    }

    boolean good(double guess, double x) {

        return Math.abs(guess * guess - x) < delta;
    }

    double improve(double guess, double x) {
        return average(guess, x / guess);
    }

    double iter(double guess, double x) {
        if (good(guess, x))
            return guess;
        else
            return iter(improve(guess, x), x);
    }

    public double calc() {
        return iter(1.0, arg);
    }
}

class Program {
    public static void main(String[] args) {
        double val = Double.parseDouble(args[0]);
        int numberOfDecimalPlaces = Integer.parseInt(args[1]);  //Точность - количество знаков после запятой

        Sqrt sqrt = new Sqrt(val, numberOfDecimalPlaces);
        double result = sqrt.calc();
        System.out.print("Sqrt of " + val + " = " + result + "\n");
    }
}