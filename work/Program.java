// Лабораторный практикум №1 задача№2 Квадратный корень числа
//Выполнил Ефремов Павел

class Sqrt
{
    //double delta = 0.00000001;
    private double delta ;                        //точность расчетов. Нужно регулировать
    private double arg;                           //тип double 64 bit; 64й бит - знак, 11бит - порядок, 52+1бит - мантисса


    Sqrt(double arg, double delta) {
        this.arg = arg;
        this.delta = delta;
    }
    private double average(double x,double y) {
        return (x + y) / 2.0;
    }
    private boolean good(double guess,double x) {
        return Math.abs(guess*guess-x) < delta;
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
    double calc() {
        return iter(1.0,arg);
    }
}

class Program {
    public static void main(String[] args) {
        double val;
        double acur;            //точность

        // Проверка на правильность ввода данных из командной строки

        try {
            val = Double.parseDouble(args[0]);
            acur = Double.parseDouble(args[1]);

        }   catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
            return;
        }

        Sqrt sqrt = new Sqrt(val, acur);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result);
    }
}