class Sqrt
{
   double delta;
   double arg;

   void Sqrt(double arg) {
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

class Program
{
   public static void main(String[] args)
   {
	   
      double val = Double.parseDouble(args[0]);
      Sqrt sqrt=new Sqrt(val);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("¬ведите колличество чисел после зап€той:");
  	int x = sc.nextInt();
  	if (x%10==0) {
  		int y = x*10;
  		double del = x/y;
  		sqrt.delta=del;
  	}
  	
      double result=sqrt.calc();
      System.out.println("Sqrt of "+val+"="+result);
   }
}