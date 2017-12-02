import java.math.BigDecimal;
import java.math.*;
class Sqrt
{
    double delta; //= 0.01;0.00000001;
    double arg;

    Sqrt(double arg, double delta) {
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

class Lab1_2{
    public static void main (String[] args) {
        //0 - число от которого берем корень, 1 - точность, количество знаков после запятой
        double val = Double.parseDouble(args[0]);
        double delta = 1/Math.pow(10,Integer.parseInt(args[1]));

        Sqrt sqrt=new Sqrt(val,delta);
        double result=sqrt.calc();
        System.out.println("Sqrt of "+val+" = "+result);

        //вывести только кол-во знаков после запятой,которое задано. Как не округлять??
        //System.out.format("%."+Integer.parseInt(args[1])+"f",result);

        //вывести только кол-во знаков после запятой,которое задано с помощью класса. Как не округлять??
        //BigDecimal result = new BigDecimal(sqrt.calc());
        //result = result.setScale(a, BigDecimal.ROUND_DOWN); // 2 - количество знаков после запятой
        //System.out.println("result = " + result.doubleValue());



    }
}