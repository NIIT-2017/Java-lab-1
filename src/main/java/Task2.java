/*
Задача 2. Квадратный корень числа

Реализовать алгоритм вычисления квадратного корня так, чтобы была возможность регулирования точности расчетов.
*/


class Sqrt {
    double arg;
    double delta;

    Sqrt(double arg) {
        this.arg=arg;
        this.delta=0.000000000001;
    }

    Sqrt(double arg, double delta) {  // перегрузка метода
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


public class Task2
{
    public static void main(String[] args)
    {
        try {
            String[] arr = args[0].split(",");
            if(arr.length!=1 && arr.length!=2){
                System.out.println("Некорректное число аргументов");
                throw new IllegalArgumentException("Incorrect number of args");
            }
            double val = Double.parseDouble(arr[0]);
            if (arr.length == 2) {
                double del = Double.parseDouble(arr[1]);
                Sqrt sqrt = new Sqrt(val, del);
                double result = sqrt.calc();
                System.out.println("Корень числа " + val + " равен " + result);
                System.out.println("Точность: " + del);
            } else {
                Sqrt sqrt = new Sqrt(val);
                double result = sqrt.calc();
                System.out.println("Sqrt of " + val + "=" + result);
            }
        } catch(Exception e){
            System.out.println("Incorrect input");
        }

    }
}
