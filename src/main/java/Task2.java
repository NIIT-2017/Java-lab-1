    public class Task2 {
        double delta;
        double arg;
        Task2(double delta, double arg){
            this.delta=delta;
            this.arg=arg;
        }
        double average(double x, double y){
            return (x+y)/2.0;
        }
        boolean good(double guess, double x){
            return Math.abs(guess*guess-x)<delta;
        }
        double improve(double guess, double x){
            return average(guess, x/guess);
        }
        double iter(double guess,double x){
            boolean a=good(guess, x);
            if (a)
                return guess;
            else
                return iter(improve(guess, x),x);
        }
        public double calc(){
            return iter (1.0,arg);
        }
    }

    class Program{
        public static void main(String[] args) {
            double val=Double.parseDouble(args[0]);
            double delta=Double.parseDouble(args[1]);
            Task2 task2=new Task2(delta,val);
            double result=task2.calc();
            System.out.println("Sqrt of "+val+" = "+result+" with delta = "+delta);
        }
    }

