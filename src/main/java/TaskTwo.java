public class TaskTwo {
    public static double sqrt(double number)
    {


        double g1;


        if(number == 0 || number == 1)
        {
            return number;
        }



        double squareRoot = number / 2;

        do {
            g1 = squareRoot;
            squareRoot = (g1 + (number / g1)) / 2;
        }
        while((g1-squareRoot)!= 0);


        System.out.println("Square roots of " + number + " are ");
        System.out.println("+" + squareRoot);
        System.out.println("-" + squareRoot);

        return squareRoot;


    }

    static double round(double v, int p) {
        int s = (int) Math.pow(10, p);
        return (double) Math.round(v * s) / s;
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int precision = Integer.parseInt(args[1]);

        System.out.println(round(sqrt(number), precision));
    }
}
