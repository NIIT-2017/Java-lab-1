import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        double val=Double.parseDouble(args[0]);
        Scanner in = new Scanner(System.in);
        System.out.println("Write degree of exactness: ");
        int exactness = in.nextInt();
        double result = cutNumber(val, exactness);
        System.out.println("Sqrt of "+val+" = "+result);
    }
    public static double cutNumber(double val, int exactness){
        Sqrt sqrt=new Sqrt(val);
        double result=sqrt.calc();
        String number = String.valueOf(result);
        //we count exactness after point. So we need the index of point
        int point = number.indexOf(".");
        // cut number according to exactness
        String cutNumber = number.substring(0,exactness+point+1);
        //find number after the last one to know how to round
        int afterLast = number.charAt(exactness+point+1)-'0';
        //find las number
        int lastBefore = number.charAt(exactness+point)-'0';
        //default: we don't change last one
        int last = lastBefore;
        //if afterlast>5, we round and change last one up
        if(afterLast>=5) {
            last = lastBefore + 1;
            cutNumber=cutNumber.substring(0,exactness+point);
            cutNumber+=String.valueOf(last);
        }
        result = Double.parseDouble(cutNumber);
        return result;
    }
}

class Sqrt{
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