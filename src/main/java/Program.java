class Sqrt
{
    double deltaD=0.00000001;
    float deltaF=0.000001f;
    double argD;
    double argF;

    Sqrt(double arg) {
        this.argD=arg;
    }
    Sqrt(float arg) {
        this.argF=arg;
    }

    double average(double x,double y) {
        return (x+y)/2.0;
    }
    double average(float x,float y) {
        return (x+y)/2.0;
    }
    boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<deltaD;
    }
    boolean good(float guess,float x) {
        return Math.abs(guess*guess-x)<deltaF;
    }
    double improve(double guess,double x) {
        return average(guess,x/guess);
    }
    double improve(float guess,float x) {
        return average(guess,x/guess);
    }
    double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    float iter(float guess, float x) {
        if(good(guess,x))
            return guess;
        else
            return (float) iter(improve(guess,x),x);
    }
    public double calcD() {
        return iter(1.0,argD);
    }
    public float calcF() {
        return (float) iter(1.0f,argF);
    }
}
public class Program {
    public static void main(String[] args) {
        if (args[1].equals("D")) {
            double valD = Double.parseDouble(args[0]);
            Sqrt sqrt = new Sqrt(valD);
            double result = sqrt.calcD();
            System.out.println("Sqrt of " + valD + "=" + result);
        } else{
            float valF = Float.parseFloat(args[0]);
        Sqrt sqrt = new Sqrt(valF);
        float result = sqrt.calcF();
        System.out.println("Sqrt of " + valF + "=" + result);
        }
    }
}



