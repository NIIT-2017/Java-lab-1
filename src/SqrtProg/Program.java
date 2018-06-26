package SqrtProg;

import java.io.*;


class Sqrt
{
    double delta=0.00000001;
    double arg;

    Sqrt(double arg) {
        this.arg=arg;
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

class Program {
    static double roundCheck;
    public static void main(String[] args) {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
      try {
          System.out.println("Выберите количество знаков после запятой");
          setRound(Integer.parseInt(d.readLine()));
          System.out.println("Введите число для взятия корня");
          double val = Double.parseDouble(d.readLine());
          Sqrt sqrt = new Sqrt(val);
          double result = (double)Math.round(sqrt.calc() * roundCheck) / roundCheck;
          System.out.println("Sqrt of " + val + "=" + result);
      }catch(Exception ex) {ex.printStackTrace();}
    }

    static double setRound(int x) {
        roundCheck = (double)Math.pow(10, x);
        return roundCheck;
    }
}
