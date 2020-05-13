class Sqrt
{
    double delta=0.00000001;
    float deltaf=0.000001f;
    double argd;
    float argf;

    Sqrt(double arg) {
        this.argd=arg;
    }

    Sqrt(float arg){
        this.argf=arg;
    }

    double average(double x,double y) {
        return (x+y)/2.0;
    }

    float average(float x, float y){
        return (x+y)/2.0f;
    }

    boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<delta;
    }

    boolean good(float guess, float x){
        return Math.abs(guess*guess-x)<deltaf;
    }

    double improve(double guess,double x) {
        return average(guess,x/guess);
    }

    float improve(float guess, float x){
        return average(guess, x/guess);
    }

    double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }

    float iter(float guess, float x){
        if(good(guess, x))
            return guess;
        else
            return iter(improve(guess, x),x);
    }

    public double calcDouble() {
        return iter(1.0,argd);
    }

    public float calcFloat(){
        return iter(1.0f, argf);
    }
}

public class task2
{
    public static void main(String[] args)
    {
        if(args[1].equals("f")){
            float valf = Float.parseFloat(args[0]);
            Sqrt sqrt=new Sqrt(valf);
            float result=sqrt.calcFloat();
            System.out.println("Sqrt (float) of "+valf+"="+result);
        } else {
            double vald=Double.parseDouble(args[0]);
            Sqrt sqrt=new Sqrt(vald);
            double result=sqrt.calcDouble();
            System.out.println("Sqrt (double) of "+vald+"="+result);
        }
    }
}


