public class SqrtDemo
{
    public static void printSqrt(double number, int signs) {
        Sqrt sqrt = new Sqrt(number, signs);
        System.out.println("Sqrt of " + number + " (delta = " + sqrt.delta + ") = " + sqrt.calc());
    }
    public static void main(String[] args) {
        printSqrt(7,15);
    }
}