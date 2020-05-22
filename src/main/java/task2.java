public class task2 {

    double delta=0.0000000000001;
    double arg;

    task2(double arg, double delta) { //конструктор класса
        this.arg=arg; // переданное значение записываем в переменную arg этого класса
        this.delta=delta;
    }
    double average(double x,double y) { // вычисление среднего значения
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
    public double calc() { // метод прокладка
        return iter(1.0,arg);
    }

    public static void main(String[] args)// главный класс который в качестве параметра при запуске принимает строку
    {
        double val=Double.parseDouble(args[0]); // переводим строку в число типа double
        double precision = Double.parseDouble(args[1]);
        task2 sqrtSubject=new task2(val, precision); // создаем объект класса sqrt и передаем сразу число
        double result=sqrtSubject.calc(); //вызываем метод класса sqrt для подсчета корня и записываем в результат
        System.out.println("Sqrt of "+val+"="+result); // выводим результат
    }
}
